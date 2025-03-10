/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_hotel_system;
import java.sql.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */

public class ManageStaffsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageStaffsForm
     */
    
    STAFFS staff = new STAFFS();
    public ManageStaffsForm() {
        initComponents();
        Border border = BorderFactory.createMatteBorder(2,2,2,2,Color.white);
        jButtonClearFields.setBorder(border);
        staff.fillStaffJTable(jTable1);
        staff.fillStaff_Position_JCombobox(jComboBoxPosition);
        jTable1.setRowHeight(40);
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
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldFNAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLNAME = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPHONE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAddStaff = new javax.swing.JButton();
        jButtonEditStaff = new javax.swing.JButton();
        jButtonRemoveStaff = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButton_Refresh_JTable_Data = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxPosition = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1141, 542));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("MANAGE STAFFS");

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1144, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 114, -1, -1));

        jTextFieldID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 111, 351, -1));

        jTextFieldFNAME.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldFNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFNAMEActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 351, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("First Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 163, -1, -1));

        jTextFieldLNAME.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jTextFieldLNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 209, 351, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 212, -1, -1));

        jTextFieldPHONE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldPHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPHONEActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 258, 351, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Phone Number:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 261, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Phone", "Position"
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

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 100, 540, 340));

    jButtonAddStaff.setBackground(new java.awt.Color(255, 255, 153));
    jButtonAddStaff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButtonAddStaff.setText("Add New Staff");
    jButtonAddStaff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonAddStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonAddStaff.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddStaffActionPerformed(evt);
        }
    });
    jPanel1.add(jButtonAddStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 151, 40));

    jButtonEditStaff.setBackground(new java.awt.Color(255, 255, 153));
    jButtonEditStaff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButtonEditStaff.setText("Edit");
    jButtonEditStaff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonEditStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEditStaff.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditStaffActionPerformed(evt);
        }
    });
    jPanel1.add(jButtonEditStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 112, 40));

    jButtonRemoveStaff.setBackground(new java.awt.Color(255, 255, 153));
    jButtonRemoveStaff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButtonRemoveStaff.setText("Remove");
    jButtonRemoveStaff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonRemoveStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonRemoveStaff.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoveStaffActionPerformed(evt);
        }
    });
    jPanel1.add(jButtonRemoveStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 151, 40));

    jButtonClearFields.setBackground(new java.awt.Color(255, 255, 153));
    jButtonClearFields.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButtonClearFields.setText("CLear Fields");
    jButtonClearFields.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonClearFieldsActionPerformed(evt);
        }
    });
    jPanel1.add(jButtonClearFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 490, 48));

    jButton_Refresh_JTable_Data.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jButton_Refresh_JTable_Data.setText("Refresh");
    jButton_Refresh_JTable_Data.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_Refresh_JTable_DataActionPerformed(evt);
        }
    });
    jPanel1.add(jButton_Refresh_JTable_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 540, -1));

    jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel9.setText("Position:");
    jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

    jComboBoxPosition.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jPanel1.add(jComboBoxPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 350, -1));

    jPanel3.setBackground(new java.awt.Color(153, 255, 153));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 1150, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 570, Short.MAX_VALUE)
    );

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1150, 570));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton_Refresh_JTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_JTable_DataActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID", "First Name", "Last Name", "Phone", "Position"}));
        staff.fillStaffJTable(jTable1);
    }//GEN-LAST:event_jButton_Refresh_JTable_DataActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        jTextFieldID.setText("");
        jTextFieldFNAME.setText("");
        jTextFieldLNAME.setText("");
        jTextFieldPHONE.setText("");
        jComboBoxPosition.setSelectedIndex(0);
        
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButtonRemoveStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveStaffActionPerformed
        try{
            int id = Integer.valueOf(jTextFieldID.getText());
            if(staff.removeStaff(id))
            {
                JOptionPane.showMessageDialog(rootPane, "Staff Deleted Successfully", "Remove Staff", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Staff Not Deleted", "Remove Staff Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter The Staff ID (number)","Staff ID Error" , JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoveStaffActionPerformed

    private void jButtonEditStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStaffActionPerformed
        int id = 0;
        String fname = jTextFieldFNAME.getText();
        String lname = jTextFieldLNAME.getText();
        String phone = jTextFieldPHONE.getText();
        String position = (String)jComboBoxPosition.getSelectedItem();
        if(fname.trim().equals("") || lname.trim().equals("")|| phone.trim().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name + Phone Number + Email", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                id = Integer.valueOf(jTextFieldID.getText());
                if(staff.editStaff(id, fname, lname, phone, position))
                {
                    JOptionPane.showMessageDialog(rootPane, "Staff Data Updated Successfully", "Edit Staff", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Staff Data Not Updated", "Edit Staff Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter The Staff ID (number)","Staff ID Error" , JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButtonEditStaffActionPerformed

    private void jButtonAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStaffActionPerformed
        try{
            int id = Integer.valueOf(jTextFieldID.getText());
            String f_name = jTextFieldFNAME.getText();
            String l_name = jTextFieldLNAME.getText();
            String phone = jTextFieldPHONE.getText();
            String position = (String)jComboBoxPosition.getSelectedItem();
            if(staff.addStaff(id, f_name, l_name, phone, position))
            {
                JOptionPane.showMessageDialog(rootPane, "New Staff Added Successfully", "Add Staff", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Staff Not Added", "Add Staff Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter The Staff ID", "Staff ID Error" , JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jButtonAddStaffActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int rIndex = jTable1.getSelectedRow();
        jTextFieldID.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldFNAME.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldLNAME.setText(model.getValueAt(rIndex, 2).toString());
        jTextFieldPHONE.setText(model.getValueAt(rIndex, 3).toString());
        jComboBoxPosition.setSelectedItem(model.getValueAt(rIndex, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextFieldPHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPHONEActionPerformed

    private void jTextFieldFNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFNAMEActionPerformed

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
            java.util.logging.Logger.getLogger(ManageStaffsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStaffsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStaffsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStaffsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new ManageStaffsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStaff;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEditStaff;
    private javax.swing.JButton jButtonRemoveStaff;
    private javax.swing.JButton jButton_Refresh_JTable_Data;
    private javax.swing.JComboBox<String> jComboBoxPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFNAME;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLNAME;
    private javax.swing.JTextField jTextFieldPHONE;
    // End of variables declaration//GEN-END:variables
}
