/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class profile extends javax.swing.JFrame {
     
    Connection con =null;
    ResultSet rs = null;
    PreparedStatement pst = null;
     DefaultTableModel model = new DefaultTableModel();
    Container cnt = this.getContentPane();
    JTable jtbl = new JTable(model);

    public profile() {
        initComponents();
        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusr = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("usrename");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 70, 150, 16);

        jLabel2.setText("password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 160, 140, 16);

        txtusr.setText("jTextField1");
        getContentPane().add(txtusr);
        txtusr.setBounds(270, 70, 73, 22);

        txtpass.setText("jTextField2");
        getContentPane().add(txtpass);
        txtpass.setBounds(270, 160, 73, 22);

        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 270, 72, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String query= "select * from addemp where username=? and password=?";
        
            try {
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
                 pst=con.prepareStatement(query);
        pst.setString(1,txtusr.getText());
         pst.setString(2,txtpass.getText());
         rs=pst.executeQuery();
         if(rs.next()){
              
                    JOptionPane.showMessageDialog(null  ,"login successfully");
                     
        model.addColumn("id");
        model.addColumn("name");
        model.addColumn("phone");
        model.addColumn("email");
        model.addColumn("post");
        model.addColumn("sal");
        model.addRow(new Object[]{rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                    int idd=rs.getInt("id");
                    String nmaee=rs.getString("name");
                    String phonee=rs.getString("phone");
                    String email=rs.getString("email");
                    String post=rs.getString("post");
                    String sal=rs.getString("sal");
                    System.out.println(idd+""+nmaee+""+phonee+""+email+""+post+""+sal);
         }
       
                 
                 
                 else{
              
                    JOptionPane.showMessageDialog(null  ,"username password do not match");
         }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            JScrollPane pg = new JScrollPane(jtbl);
        cnt.add(pg);
        this.pack();

        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        JFrame frame = new profile();
        frame.setTitle("Profile info");
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtusr;
    // End of variables declaration//GEN-END:variables
}
