/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr;

/**
 *
 * @author 91788
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.Cursor;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class preports extends JFrame  implements ActionListener{
     DefaultTableModel model = new DefaultTableModel();
    Container cnt = this.getContentPane();
    JTable jtbl = new JTable(model);
    JButton bt1=new JButton("Go Back");
     JButton bt2=new JButton("Delete Project");
     public preports() {
        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
         model.addColumn("pid");
        model.addColumn("projectname");
        model.addColumn("clientname");
        model.addColumn("projecttype");
        model.addColumn("projectmanager");
       
        
        model.addColumn("projectreports");
        this.add(bt1);
        this.add(bt2);
        bt2.setBounds(30,40,50,40);
        bt1.addActionListener(this);
         bt2.addActionListener(this);
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM project");
            ResultSet Rs = pstm.executeQuery();
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(5),Rs.getString(9)});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JScrollPane pg = new JScrollPane(jtbl);
        cnt.add(pg);
        this.pack();
    }
     public static void main(String[] args) {
        JFrame frame = new preports();
        frame.setTitle("Project Reports");
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
         
    @Override
    public void actionPerformed(ActionEvent e) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(e.getSource()==bt1){
            hrtasks obj=new hrtasks();
            this.setVisible(false);
            obj.setVisible(true);
        } 
        else if(e.getSource()==bt2){
       
         
         try {
             
       int row = jtbl.getSelectedRow();
      String eve = jtbl.getModel().getValueAt(row, 0).toString();
      System.out.println("hi");

      String delRow = "delete from project where pid="+eve;
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
        PreparedStatement pstm = con.prepareStatement(delRow);
      //PreparedStatement ps =  Connection con.getConnection().prepareStatement(delRow);
        pstm.execute();
            System.out.println("congo");
            JOptionPane.showMessageDialog(null, "Congratulation deletion suuceessfully from databse !!");
        } 
          catch (ClassNotFoundException ex) {
          java.util.logging.Logger.getLogger(allemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           } catch (SQLException ex) {   
                java.util.logging.Logger.getLogger(allemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }   
         } 
                
  }

    }
  
    
   

