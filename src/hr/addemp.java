/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr;

/**
 *
 * @author 91788
 */

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class addemp extends javax.swing.JFrame {

    /**
     * Creates new form addemp
     */
    public addemp() {
        initComponents();
       // String s;
     setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    setSize(770,630);
    setVisible(true);
    //String s;
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
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jl10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ju1 = new javax.swing.JTextField();
        jp1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText(" Add New Employee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 380, 70);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Emp id :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 80, 30);

        txtid.setText("jTextField1");
        getContentPane().add(txtid);
        txtid.setBounds(200, 120, 100, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Emp name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 180, 110, 25);

        txtname.setText("jTextField2");
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(200, 180, 100, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Emp Phone :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 240, 130, 25);

        txtphone.setText("jTextField3");
        getContentPane().add(txtphone);
        txtphone.setBounds(200, 240, 100, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText(" Emp email :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 300, 120, 25);

        txtemail.setText("jTextField4");
        getContentPane().add(txtemail);
        txtemail.setBounds(200, 300, 100, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Emp post :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 360, 120, 25);

        txtpost.setText("jTextField5");
        getContentPane().add(txtpost);
        txtpost.setBounds(200, 360, 100, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Emp salary :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 420, 110, 25);

        txtsal.setText("jTextField6");
        getContentPane().add(txtsal);
        txtsal.setBounds(200, 420, 110, 22);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 440, 110, 30);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("BROWSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(530, 370, 130, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jl10.setText("jLabel9");
        jPanel1.add(jl10);
        jl10.setBounds(20, 30, 180, 160);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(490, 120, 210, 210);

        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(150, 90, 0, 420);

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(150, 90, 10, 490);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Username :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 470, 110, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Password :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 520, 100, 25);

        ju1.setText("jTextField1");
        getContentPane().add(ju1);
        ju1.setBounds(200, 470, 110, 22);

        jp1.setText("jTextField2");
        getContentPane().add(jp1);
        jp1.setBounds(200, 520, 110, 22);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1, 0, 2410, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.home")));
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
           //if the user click on save in Jfilechooser
           if(result == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
              JOptionPane.showMessageDialog(null, "no file select");
              
              
              
          }
          
          if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              String path = selectedFile.getAbsolutePath();
              jl10.setIcon(ResizeImage(path));
             String s = path;
              try{
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
              
               PreparedStatement ps = con.prepareStatement("insert into addemp(id,name,phone,email,post,sal,image,username,password) values(?,?,?,?,?,?,?,?,?)");
               
               InputStream is = new FileInputStream(new File(s));
               ps.setString(1, txtid.getText());
               ps.setString(2, txtname.getText());
               ps.setString(3, txtphone.getText());
               ps.setString(4, txtemail.getText());
               ps.setString(5, txtpost.getText());
               ps.setString(6, txtsal.getText());
               // ps.setString(10, ju1.getText());
                 //ps.setString(11, jp1.getText());
               
               //jc1.getSelectedItem().toString()
              // ps.setString(3, txtphone.getText());
               ps.setBlob(7,is);
               ps.setString(8, ju1.getText());
                 ps.setString(9, jp1.getText());
               
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data Inserted");
               
               
           }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                 Logger.getLogger(addemp.class.getName()).log(Level.SEVERE, null, ex);
             }
          }
           //if the user click on save in Jfilechooser


          else if(result == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
          }
          
        

    
    
   
    
      // Methode to resize imageIcon with the same size of a Jlabel
    //public ImageIcon ResizeImage(String ImagePath)
   // {
    //    ImageIcon MyImage = new ImageIcon(ImagePath);
      //  Image img = MyImage.getImage();
        //Image newImg = img.getScaledInstance(jl10.getWidth(), jl10.getHeight(), Image.SCALE_SMOOTH);
        //ImageIcon image = new ImageIcon(newImg);
        //return image;
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        image obj=new image();
        this.setVisible(false);
        obj.setVisible(true);
     //   String path = null;
      //   try{
        //       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
              
          //     PreparedStatement ps = con.prepareStatement("insert into addemp(id,name,phone,email,post,sal,hiring,image) values(?,?,?,?,?,?,?,?)");
               
            //   InputStream is = new FileInputStream(new File(path));
              // ps.setString(1, txtid.getText());
              // ps.setString(2, txtname.getText());
              // ps.setString(3, txtphone.getText());
              // ps.setString(3, txtemail.getText());
               //ps.setString(3, txtpost.getText());
               //ps.setString(3, txtsal.getText());
               //ps.setString(3, txtphone.getText());
               //ps.setBlob(4,is);
               //ps.executeUpdate();
               //JOptionPane.showMessageDialog(null, "Data Inserted");
          // }catch(Exception ex){
            //   ex.printStackTrace();
          // }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed
//Methode To Resize The ImageIcon
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(jl10.getWidth(), jl10.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
}

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
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addemp().setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jl10;
    private javax.swing.JTextField jp1;
    private javax.swing.JTextField ju1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtpost;
    private javax.swing.JTextField txtsal;
    // End of variables declaration//GEN-END:variables
}
