/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr;

import java.awt.Color;
import java.awt.Image;
import java.beans.Statement;
import static java.lang.String.format;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import curtain.call.DBloader;
import java.sql.SQLException;
//import static java.text.MessageFormat.format;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
public class empprojectdetails extends javax.swing.JFrame {

   Connection con =null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public empprojectdetails() {
        initComponents();
        setSize(690,630);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jt1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jt2 = new javax.swing.JTextField();
        jt3 = new javax.swing.JTextField();
        jt4 = new javax.swing.JTextField();
        jt5 = new javax.swing.JTextField();
        jt6 = new javax.swing.JTextField();
        jt7 = new javax.swing.JTextField();
        jt8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Enter ur project id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 100, 220, 40);

        jt1.setText("jTextField1");
        getContentPane().add(jt1);
        jt1.setBounds(180, 110, 140, 22);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 110, 140, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Project name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 110, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Client name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 230, 120, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Project Type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 300, 120, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Project Manager");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 360, 160, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Developing Platform");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 420, 180, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Database");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 480, 130, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Project Description");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 540, 170, 25);

        jt2.setText("jTextField1");
        getContentPane().add(jt2);
        jt2.setBounds(180, 170, 140, 22);

        jt3.setText("jTextField2");
        getContentPane().add(jt3);
        jt3.setBounds(180, 240, 140, 22);

        jt4.setText("jTextField3");
        getContentPane().add(jt4);
        jt4.setBounds(180, 300, 130, 22);

        jt5.setText("jTextField4");
        getContentPane().add(jt5);
        jt5.setBounds(180, 360, 130, 22);

        jt6.setText("jTextField5");
        getContentPane().add(jt6);
        jt6.setBounds(190, 420, 130, 22);

        jt7.setText("jTextField6");
        getContentPane().add(jt7);
        jt7.setBounds(190, 480, 130, 22);

        jt8.setText("jTextField7");
        getContentPane().add(jt8);
        jt8.setBounds(190, 540, 130, 22);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 80, 570, 10);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Project Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 228, 48);

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 550, 72, 22);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-3, -4, 2460, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String query= "select * from project where pid=?";
        
            try {
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
                 pst=con.prepareStatement(query);
        pst.setString(1,jt1.getText());
        
         rs=pst.executeQuery();
         if(rs.next()){
              
                    JOptionPane.showMessageDialog(null  ,"ID Matched Successfully");
                     String pnamee=rs.getString("projectname");
                     String cname=rs.getString("clientname");
                      String ptype=rs.getString("projecttype");
                      
                     String pmanager=rs.getString("projectmanager");
                      String dplat=rs.getString("developingplatform");
                     String datab=rs.getString("databse");
                     String prodes=rs.getString("projectdescription");
                     
                     jt2.setText(pnamee);
                     jt3.setText(cname);
                     jt4.setText(ptype);
                     jt5.setText(pmanager);
                     jt6.setText(dplat);
                     jt7.setText(datab);
                     jt8.setText(prodes);
                     
                     
                     
         }
         //String querry="select name,post from addemp";
         
         else{
              
                    JOptionPane.showMessageDialog(null  ,"ID Not Matched Re-Enter Ur ID Again ");
         }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        emptasks obj=new emptasks();
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(empprojectdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empprojectdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empprojectdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empprojectdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empprojectdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    private javax.swing.JTextField jt4;
    private javax.swing.JTextField jt5;
    private javax.swing.JTextField jt6;
    private javax.swing.JTextField jt7;
    private javax.swing.JTextField jt8;
    // End of variables declaration//GEN-END:variables
}
