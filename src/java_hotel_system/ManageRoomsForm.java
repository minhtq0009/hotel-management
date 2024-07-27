/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_hotel_system;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ManageRoomsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageRoomsForm
     */
    ROOMS room = new ROOMS();
    public ManageRoomsForm() {
        initComponents();
        room.fillRoom_TYPE_JCombobox(jComboBoxType);
        room.fillRoomJTable(jTable1);
        jTable1.setRowHeight(40);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonYES);
        bg.add(jRadioButtonNO);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPHONE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonADDRoom = new javax.swing.JButton();
        jButtonEditRoom = new javax.swing.JButton();
        jButtonRemoveRoom = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButton_Refresh_JTable_Data = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonShowRoomTypes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonYES = new javax.swing.JRadioButton();
        jRadioButtonNO = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1156, 554));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("MANAGE ROOMS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Number:");

        jTextFieldNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type:");

        jTextFieldPHONE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldPHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPHONEActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone Number:");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Type", "Phone", "Reserved"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable1.setGridColor(new java.awt.Color(255, 255, 153));
    jTable1.setSelectionBackground(new java.awt.Color(51, 255, 51));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButtonADDRoom.setBackground(new java.awt.Color(255, 255, 153));
    jButtonADDRoom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButtonADDRoom.setText("Add New Room");
    jButtonADDRoom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonADDRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonADDRoom.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonADDRoomActionPerformed(evt);
        }
    });

    jButtonEditRoom.setBackground(new java.awt.Color(255, 255, 153));
    jButtonEditRoom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButtonEditRoom.setText("Edit");
    jButtonEditRoom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonEditRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEditRoom.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditRoomActionPerformed(evt);
        }
    });

    jButtonRemoveRoom.setBackground(new java.awt.Color(255, 255, 153));
    jButtonRemoveRoom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButtonRemoveRoom.setText("Remove");
    jButtonRemoveRoom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonRemoveRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonRemoveRoom.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoveRoomActionPerformed(evt);
        }
    });

    jButtonClearFields.setBackground(new java.awt.Color(255, 255, 153));
    jButtonClearFields.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButtonClearFields.setText("CLear Fields");
    jButtonClearFields.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonClearFieldsActionPerformed(evt);
        }
    });

    jButton_Refresh_JTable_Data.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButton_Refresh_JTable_Data.setText("Refresh");
    jButton_Refresh_JTable_Data.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_Refresh_JTable_DataActionPerformed(evt);
        }
    });

    jComboBoxType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jComboBoxType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxTypeActionPerformed(evt);
        }
    });

    jButtonShowRoomTypes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButtonShowRoomTypes.setText("Show Types");
    jButtonShowRoomTypes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonShowRoomTypesActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Reserved:");

    jRadioButtonYES.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jRadioButtonYES.setText("YES");

    jRadioButtonNO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jRadioButtonNO.setText("NO");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jRadioButtonYES)
            .addGap(18, 18, 18)
            .addComponent(jRadioButtonNO))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButtonYES)
                .addComponent(jRadioButtonNO))
            .addGap(0, 0, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonClearFields, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonADDRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(jButtonEditRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jButtonRemoveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldPHONE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonShowRoomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(60, 60, 60))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jButton_Refresh_JTable_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
            .addGap(17, 17, 17))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonShowRoomTypes))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(86, 86, 86)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonADDRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRemoveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton_Refresh_JTable_Data)))
            .addContainerGap(42, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int rIndex = jTable1.getSelectedRow();
        jTextFieldNumber.setText(model.getValueAt(rIndex, 0).toString());
        jComboBoxType.setSelectedItem(model.getValueAt(rIndex, 1));
        jTextFieldPHONE.setText(model.getValueAt(rIndex, 2).toString());
        String isReserved = model.getValueAt(rIndex, 3).toString();
        if(isReserved.equals("YES"))
        {
            jRadioButtonYES.setSelected(true);
        }else if(isReserved.equals("NO"))
        {
            jRadioButtonNO.setSelected(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonADDRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDRoomActionPerformed
        try{
            int roomNumber = Integer.valueOf(jTextFieldNumber.getText());
            int roomType = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
            String phone = jTextFieldPHONE.getText();
            if(room.addRoom(roomNumber, roomType, phone))
            {
                JOptionPane.showMessageDialog(rootPane, "New Room Added Successfully", "Add Room", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Room Not Added", "Add Room Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter The Room Number","Room Number Error" , JOptionPane.WARNING_MESSAGE);
            }

    }//GEN-LAST:event_jButtonADDRoomActionPerformed

    private void jButtonEditRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditRoomActionPerformed
        int roomNumber = 0;
        int type = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
        String phone = jTextFieldPHONE.getText();
        String isReserved = "No";
        if(jRadioButtonYES.isSelected())
        {
            isReserved = "YES";
        }
        if(phone.trim().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> Phone Number", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                roomNumber = Integer.valueOf(jTextFieldNumber.getText());
                if(room.editRoom(roomNumber, type, phone, isReserved))
                {
                    JOptionPane.showMessageDialog(rootPane, "Room Data Updated Successfully", "Edit Room", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Room Data Not Updated", "Edit Room Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter Room Number","Room Number Error" , JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_jButtonEditRoomActionPerformed

    private void jButtonRemoveRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveRoomActionPerformed
       try{
                int roomNumber = Integer.valueOf(jTextFieldNumber.getText());
                if(room.removeRoom(roomNumber))
                {
                    JOptionPane.showMessageDialog(rootPane, "Room Deleted Successfully", "Remove Room", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Room Not Deleted", "Remove Room Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter Room Number","Room Number Error" , JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jButtonRemoveRoomActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        jTextFieldNumber.setText("");
        jTextFieldPHONE.setText("");
        jComboBoxType.setSelectedIndex(0);
        jRadioButtonNO.setSelected(true);
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButton_Refresh_JTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_JTable_DataActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Number","Type","Phone","Reserved"}));
        room.fillRoomJTable(jTable1);
    }//GEN-LAST:event_jButton_Refresh_JTable_DataActionPerformed

    private void jTextFieldPHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPHONEActionPerformed

    private void jButtonShowRoomTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowRoomTypesActionPerformed
        ALL_ROOMS_TYPE_FORM roomTypesForm = new  ALL_ROOMS_TYPE_FORM();
        roomTypesForm.setVisible(true);
        roomTypesForm.pack();
        roomTypesForm.setLocationRelativeTo(null);
        roomTypesForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonShowRoomTypesActionPerformed

    private void jComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTypeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonADDRoom;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEditRoom;
    private javax.swing.JButton jButtonRemoveRoom;
    private javax.swing.JButton jButtonShowRoomTypes;
    private javax.swing.JButton jButton_Refresh_JTable_Data;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonNO;
    private javax.swing.JRadioButton jRadioButtonYES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldPHONE;
    // End of variables declaration//GEN-END:variables
}
