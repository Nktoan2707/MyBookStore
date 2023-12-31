/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.BookBUS;
import BUS.OrderDetailBUS;
import BUS.OrdersBUS;
import POJO.BookPOJO;
import POJO.OrderDetailPOJO;
import POJO.OrdersPOJO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bachl
 */
public class ViewOrderDetailsFrame extends javax.swing.JFrame {
    private ArrayList<OrderDetailPOJO> listBooksInOrder;
    private final String idOrder;
    private final String username;
    private OrdersPOJO order;
    private final DefaultTableModel tableBoughtBooksModel = new DefaultTableModel() {
        // disable to edit table
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };
    /**
     * Creates new form ViewOrderDetailsFrame
     */
    public ViewOrderDetailsFrame(String username, String idOrder) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.idOrder = idOrder;
        this.username = username;
        
        initInformationOrder();
        initTable();
        fillTableBooksInOrder();
    }
    
    private ArrayList<OrderDetailPOJO> getBooksInOrder(String idOrder) {
        OrderDetailBUS bus = new OrderDetailBUS();
        this.listBooksInOrder = bus.getListBooksInOrder(idOrder);
        
        return listBooksInOrder;
    }
    
    private void initInformationOrder() {
        OrdersBUS bus = new OrdersBUS();
        this.order = bus.getOrdersById(idOrder);
        
        String createdAt = order.getCreateAt();
        String createdBy = order.getCreateBy();
        String boughtBy = order.getBoughtBy();
                
        txtId.setText(idOrder);
        txtId.setEditable(false);
        txtCreatedAt.setText(createdAt);
        txtCreatedBy.setText(createdBy);
        txtBoughtBy.setText(boughtBy);
        txtTotalMoney.setText(Integer.toString(order.getSumCost()));
    }

    private void initTable() {
        String[] cols = new String[] { "Book Name", "Percent Sale", "Quantity", "Cost"};
        tableBoughtBooksModel.setColumnIdentifiers(cols);
        tableBoughtBooksModel.setRowCount(0);

        tableBoughtBooks.setModel(tableBoughtBooksModel);
    }
    
  
    private void fillTableBooksInOrder() {
        ArrayList<OrderDetailPOJO> listBooksInOrder = getBooksInOrder(idOrder);
        tableBoughtBooksModel.setRowCount(0);

        for (int i = 0; i < listBooksInOrder.size(); i++) {
            String nameBook = listBooksInOrder.get(i).getNameBook();
            double percentSale = listBooksInOrder.get(i).getPercentSale();
            int quantity = listBooksInOrder.get(i).getQuantity();
            int price = listBooksInOrder.get(i).getPrice();

            tableBoughtBooksModel.addRow(new String[] { nameBook, String.valueOf(percentSale), String.valueOf(quantity), String.valueOf(price) });
        }
        tableBoughtBooksModel.fireTableDataChanged();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCreatedAt = new javax.swing.JTextField();
        txtCreatedBy = new javax.swing.JTextField();
        txtBoughtBy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBoughtBooks = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtTotalMoney = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Created at: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Created by:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Bought by:");

        txtId.setEditable(false);
        txtId.setText("jTextField1");
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtId.setPreferredSize(new java.awt.Dimension(64, 25));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtCreatedAt.setEditable(false);
        txtCreatedAt.setText("jTextField2");
        txtCreatedAt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCreatedAt.setPreferredSize(new java.awt.Dimension(64, 25));

        txtCreatedBy.setEditable(false);
        txtCreatedBy.setText("jTextField3");
        txtCreatedBy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCreatedBy.setPreferredSize(new java.awt.Dimension(64, 25));
        txtCreatedBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatedByActionPerformed(evt);
            }
        });

        txtBoughtBy.setEditable(false);
        txtBoughtBy.setText("jTextField4");
        txtBoughtBy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBoughtBy.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Bought books:");

        tableBoughtBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableBoughtBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book Name", "Percent Sale", "Quantity", "Cost"
            }
        ));
        tableBoughtBooks.setRowHeight(25);
        tableBoughtBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBoughtBooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBoughtBooks);

        jLabel6.setText("Total Money: ");

        txtTotalMoney.setEditable(false);
        txtTotalMoney.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalMoneyActionPerformed(evt);
            }
        });

        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCreatedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBoughtBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCreatedAt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 569, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCreatedAt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCreatedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBoughtBy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotalMoney)
                        .addComponent(btnUpdate)
                        .addComponent(btnBack))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                       

    private void tableBoughtBooksMouseClicked(java.awt.event.MouseEvent evt) {                                              
        
    }                                             

    private void txtTotalMoneyActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void txtCreatedByActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.dispose();
        UpdateOrderFrame updateOrderFrame = new UpdateOrderFrame(username, listBooksInOrder, order);
        updateOrderFrame.setVisible(true);
            
    }                                         

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        this.setVisible(false);
        ViewOrdersFrame viewOrders = new ViewOrdersFrame(username);
        viewOrders.setVisible(true);
    }                                       

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBoughtBooks;
    private javax.swing.JTextField txtBoughtBy;
    private javax.swing.JTextField txtCreatedAt;
    private javax.swing.JTextField txtCreatedBy;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTotalMoney;
    // End of variables declaration                   
}
