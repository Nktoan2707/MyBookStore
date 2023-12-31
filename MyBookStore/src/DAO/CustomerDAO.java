/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.CustomerPOJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bachl
 */
public class CustomerDAO {
    public String getMaxIDCustomer() {
        String maxID = null;
        
        try {
            Connection connection = Database.createConnection();
            Statement statement;
            statement = connection.createStatement();
            String query = "SELECT max(id) from customer";
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()) {
                maxID = rs.getString("max(id)");
            }
            
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
            maxID = "";
        }
        return maxID;
    }
    
    public boolean addNewCustomer(CustomerPOJO cus) {
        try {
            Connection connection = Database.createConnection();

            //Prepared statement
            String query = "INSERT INTO customer " + "VALUES(?, ?, ?, ?)";
            PreparedStatement pstmt = null;
            pstmt = connection.prepareStatement(query);

            //Set parameters
            pstmt.setString(1, cus.getId());
            pstmt.setString(2, cus.getName());
            pstmt.setInt(3, cus.getOfficialCustomer());
            pstmt.setDouble(4, cus.getDiscount());

            pstmt.executeUpdate();

            pstmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public CustomerPOJO getCustomerById(String idCustomer) {
        CustomerPOJO customer = null;
        Connection connection = Database.createConnection();

        try {
            String sql = "SELECT * FROM customer WHERE id=?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, idCustomer);

            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                int officialCustomer = rs.getInt("official_customer");
                double discount = rs.getDouble("discount");

                customer = new CustomerPOJO(id, name, officialCustomer, discount);
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPOJO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                  connection.close();
                } catch (SQLException ex) {
                  ex.printStackTrace();
                }
            }
        }
      
        return customer;
    }
}
