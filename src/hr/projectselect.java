/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr;

import java.awt.Color;
import java.awt.Image;
import java.beans.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import curtain.call.DBloader;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class projectselect extends javax.swing.JFrame {

    /**
     * Creates new form projectselect
     */
    public projectselect() {
        initComponents();
        setSize(710,650);
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
        jl2 = new javax.swing.JLabel();
        jt1 = new javax.swing.JTextField();
        jl3 = new javax.swing.JLabel();
        jt2 = new javax.swing.JTextField();
        jl4 = new javax.swing.JLabel();
        jt3 = new javax.swing.JTextField();
        jl5 = new javax.swing.JLabel();
        jc1 = new javax.swing.JComboBox<>();
        jl6 = new javax.swing.JLabel();
        jt4 = new javax.swing.JTextField();
        jl7 = new javax.swing.JLabel();
        jt5 = new javax.swing.JTextField();
        jl8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Add Project");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 270, 60);

        jl2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl2.setText("Project Name :");
        getContentPane().add(jl2);
        jl2.setBounds(20, 120, 170, 30);

        jt1.setText("jTextField1");
        getContentPane().add(jt1);
        jt1.setBounds(210, 130, 140, 22);

        jl3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl3.setText("Client Name :");
        getContentPane().add(jl3);
        jl3.setBounds(20, 190, 160, 30);

        jt2.setText("jTextField2");
        getContentPane().add(jt2);
        jt2.setBounds(210, 200, 140, 22);

        jl4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl4.setText(" Project Type :");
        getContentPane().add(jl4);
        jl4.setBounds(10, 250, 140, 30);

        jt3.setText("jTextField3");
        getContentPane().add(jt3);
        jt3.setBounds(210, 260, 150, 22);

        jl5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl5.setText("Project Manager :");
        getContentPane().add(jl5);
        jl5.setBounds(20, 320, 180, 30);

        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "arsh", "amisha", "ballu", "gurnoor", "khushman", " " }));
        getContentPane().add(jc1);
        jc1.setBounds(220, 320, 140, 22);

        jl6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl6.setText("Developing Platform :");
        getContentPane().add(jl6);
        jl6.setBounds(20, 390, 190, 30);

        jt4.setText("jTextField4");
        getContentPane().add(jt4);
        jt4.setBounds(220, 390, 150, 22);

        jl7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl7.setText("Database  Technology :");
        getContentPane().add(jl7);
        jl7.setBounds(20, 450, 210, 30);

        jt5.setText("jTextField5");
        getContentPane().add(jt5);
        jt5.setBounds(220, 460, 150, 22);

        jl8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl8.setText("Project Description :");
        getContentPane().add(jl8);
        jl8.setBounds(440, 130, 190, 30);

        jta1.setColumns(20);
        jta1.setRows(5);
        jScrollPane1.setViewportView(jta1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 190, 234, 110);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 530, 120, 30);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 530, 110, 31);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 500, 660, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 2001, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pnam=jt1.getText();
        String cnam=jt2.getText();
        String p_type=jt3.getText();
        String p_manager=jc1.getSelectedItem().toString();
        String develop_platform=jt4.getText();
        String databsetech=jt5.getText();
        String pro_des=jta1.getText();
      if(pnam.equals("")||cnam.equals("")||p_type.equals("")||p_manager.equals("")||develop_platform.equals("")||databsetech.equals("")||pro_des.equals("")){
          JOptionPane.showMessageDialog(this,"all fields are manadatory");
      }
       try{
            ResultSet rs=DBloader.executeSQL("select * from project");
            rs.moveToInsertRow();
            String exp=jc1.getSelectedItem().toString();
            
           
            
            rs.updateString("projectname", pnam);
            rs.updateString("clientname", cnam);
            rs.updateString("projecttype",p_type);
            rs.updateString("projectmanager",p_manager);
            rs.updateString("developingplatform",develop_platform);
            rs.updateString("databse",databsetech);
            rs.updateString("projectdescription",pro_des);
             rs.insertRow();
                JOptionPane.showMessageDialog(this,"Project added");
                 
        }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hrtasks obj=new hrtasks();
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
            java.util.logging.Logger.getLogger(projectselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projectselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projectselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projectselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projectselect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    private javax.swing.JTextField jt4;
    private javax.swing.JTextField jt5;
    private javax.swing.JTextArea jta1;
    // End of variables declaration//GEN-END:variables
}