/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.*;
public class allemp extends JFrame implements ActionListener{
 DefaultTableModel model = new DefaultTableModel();
    Container cnt = this.getContentPane();
    JTable jtbl = new JTable(model);
    JLabel lb1= new JLabel("Exsisting employees details");
    JButton bt1=new JButton("ADD Employee");
    JButton bt2=new JButton("Delete Employee");
    
    public allemp() {
        setSize(500,500);
        setVisible(true);
       // lb1.setBounds(100,50,50,200);
       cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
        model.addColumn("id");
        model.addColumn("name");
        model.addColumn("phone");
        model.addColumn("email");
         model.addColumn("post");
          model.addColumn("sal");
           model.addColumn("image");
           this.add(lb1);
           bt1.setBounds(20, 160, 190, 40);
           bt2.setBounds(20, 160, 190, 40);
           this.add(bt1);
           this.add(bt2);
           bt1.addActionListener( this);
           bt2.addActionListener( this);
           jtbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM addemp");
            ResultSet Rs = pstm.executeQuery();
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getInt(1), Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(5),Rs.getString(6),Rs.getBlob(7)});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JScrollPane pg = new JScrollPane(jtbl);
        cnt.add(pg);
        this.pack();
    }
    public static void main(String[] args) {
        JFrame frame = new allemp();
        frame.setTitle("existing employees");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            addemp obj=new addemp();
            this.setVisible(false);
            obj.setVisible(true);
        }
       else if(e.getSource()==bt2){
                //DefaultTableModel model = (DefaultTableModel) jTable.getModel();
         if(jtbl.getSelectedRow() != -1) {
               // remove selected row from the model
         model.removeRow(jtbl.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
         }
         try {
       int row = jtbl.getSelectedRow();
      String eve = jtbl.getModel().getValueAt(row, 0).toString();
      System.out.println("hi");

      String delRow = "delete from addemp where id="+eve;
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
        PreparedStatement pstm = con.prepareStatement(delRow);
      //PreparedStatement ps =  Connection con.getConnection().prepareStatement(delRow);
        pstm.execute();
            System.out.println("congo");
            JOptionPane.showMessageDialog(null, "Congratulation !!");
        } 
          catch (ClassNotFoundException ex) {
          Logger.getLogger(allemp.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {   
                Logger.getLogger(allemp.class.getName()).log(Level.SEVERE, null, ex);
            }   
                
  }
            
   }
 
    }


        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    

