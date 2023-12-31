/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.CategoryBUS;
import javax.swing.JOptionPane;

/**
 *
 * @author bachl
 */
public class EditCategoryFrame extends javax.swing.JFrame {
    
    String currentTextFieldID;
    String currentTextFieldName;
    String currentTextFieldDescription;
    boolean isEnabled;
    
    /**
     * Creates new form EditCategoryFrame
     */
    public EditCategoryFrame(String currentTextFieldID, String currentTextFieldName, String currentTextFieldDescription, boolean isEnabled) {
        initComponents();
        this.currentTextFieldID = currentTextFieldID;
        this.currentTextFieldName = currentTextFieldName;
        this.currentTextFieldDescription = currentTextFieldDescription;
        this.isEnabled = isEnabled;
        
        setIntialData();
        this.setLocationRelativeTo(null);
    }
    
    private void setIntialData() {
        textFieldID.setText(currentTextFieldID);
        textFieldName.setText(currentTextFieldName);
        textFieldDescription.setText(currentTextFieldDescription);
        
        if(isEnabled) {
            btnEnable.setEnabled(false);
            btnDisable.setEnabled(true);
        } else {
            btnEnable.setEnabled(true);
            btnDisable.setEnabled(false);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelID = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();
        textFieldID = new javax.swing.JTextField();
        textFieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textFieldDescription = new javax.swing.JTextArea();
        btnDisable = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEnable = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit category");
        setResizable(false);

        labelID.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        labelID.setText("ID");

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        labelName.setText("Name");

        labelDescription.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        labelDescription.setText("Description");

        textFieldID.setEditable(false);
        textFieldID.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        textFieldID.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldID.setPreferredSize(new java.awt.Dimension(96, 40));
        textFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIDActionPerformed(evt);
            }
        });

        textFieldName.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        textFieldName.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldName.setPreferredSize(new java.awt.Dimension(96, 40));
        textFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNameKeyTyped(evt);
            }
        });

        textFieldDescription.setColumns(20);
        textFieldDescription.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        textFieldDescription.setRows(5);
        textFieldDescription.setMargin(new java.awt.Insets(2, 8, 2, 6));
        jScrollPane1.setViewportView(textFieldDescription);

        btnDisable.setBackground(new java.awt.Color(255, 153, 255));
        btnDisable.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDisable.setForeground(new java.awt.Color(51, 51, 51));
        btnDisable.setText("Disable");
        btnDisable.setPreferredSize(new java.awt.Dimension(115, 40));
        btnDisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisableActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(115, 40));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 153, 153));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(115, 40));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEnable.setBackground(new java.awt.Color(102, 102, 255));
        btnEnable.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEnable.setForeground(new java.awt.Color(51, 51, 51));
        btnEnable.setText("Enable");
        btnEnable.setPreferredSize(new java.awt.Dimension(115, 40));
        btnEnable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(102, 255, 204));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(51, 51, 51));
        btnRefresh.setText("Refresh");
        btnRefresh.setPreferredSize(new java.awt.Dimension(128, 40));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIDActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        textFieldName.setText("");
        textFieldDescription.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       int choice = JOptionPane.showConfirmDialog(rootPane, "You surely want to update category?", "Message", JOptionPane.YES_NO_CANCEL_OPTION);
       
       if(choice == JOptionPane.YES_OPTION) {
           String idCategory = textFieldID.getText();
           String nameCategory = textFieldName.getText();
           String descriptionCategory = textFieldDescription.getText();
           
           CategoryBUS business = new CategoryBUS();
           business.updateCategory(idCategory, nameCategory, descriptionCategory);
           
           if(business != null) {
               JOptionPane.showMessageDialog(rootPane, "Update category successfully!");
           }
           else {
               JOptionPane.showMessageDialog(rootPane, "Update category unsuccessfully. Please try it later!");
           }
       }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void textFieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNameKeyTyped
        // TODO add your handling code here:
//        String changeTextFieldName = textFieldName.getText();
//        
//        if(!changeTextFieldName.equals(currentTextFieldName)) {
//            btnUpdate.setEnabled(true);
//        }
//        else {
////            JOptionPane.showMessageDialog(rootPane, changeTextFieldName);
//            btnUpdate.setEnabled(false);
//        }
    }//GEN-LAST:event_textFieldNameKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "You surely want to delete category?", "Message", JOptionPane.YES_NO_CANCEL_OPTION);
       
        if(choice == JOptionPane.YES_OPTION) {
            String idCategory = textFieldID.getText();

            CategoryBUS business = new CategoryBUS();
            business.deleteCategory(idCategory);

            if(business != null) {
                JOptionPane.showMessageDialog(rootPane, "Delete category successfully!");
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Delete category unsuccessfully. Please try it later!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEnableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "You surely want to enable this category?", 
                "Message", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(choice == JOptionPane.YES_OPTION) {
            CategoryBUS business = new CategoryBUS();
            boolean isSucced = business.enabledCategory(currentTextFieldID);

            if(isSucced) {
                JOptionPane.showMessageDialog(rootPane, "Enabled category successfully!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Enabled category unsuccessfully. Please try it later!");
            }
        }
    }//GEN-LAST:event_btnEnableActionPerformed

    private void btnDisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisableActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "You surely want to disable this category?", 
                "Message", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(choice == JOptionPane.YES_OPTION) {
            CategoryBUS business = new CategoryBUS();
            boolean isSucced = business.disabledCategory(currentTextFieldID);

            if(isSucced) {
                JOptionPane.showMessageDialog(rootPane, "Disabled category successfully!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Disabled category unsuccessfully. Please try it later!");
            }
        }
    }//GEN-LAST:event_btnDisableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisable;
    private javax.swing.JButton btnEnable;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelName;
    public javax.swing.JTextArea textFieldDescription;
    public javax.swing.JTextField textFieldID;
    public javax.swing.JTextField textFieldName;
    // End of variables declaration//GEN-END:variables
}
