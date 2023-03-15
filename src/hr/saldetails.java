/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.*;

public class saldetails extends JFrame implements ActionListener{
    DefaultTableModel model = new DefaultTableModel();
    Container cnt = this.getContentPane();
    JTable jtbl = new JTable(model);
    JButton bt1=new JButton("back");
    public saldetails() {
        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
        model.addColumn("id");
        model.addColumn("name");
        model.addColumn("post");
        model.addColumn("sal");
        model.addColumn("month");
        model.addColumn("amount");
        this.add(bt1);
        bt1.addActionListener((ActionListener) this);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM addemp");
            ResultSet Rs = pstm.executeQuery();
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getInt(1), Rs.getString(2),Rs.getString(5),Rs.getString(6),Rs.getString(8),Rs.getString(9)});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JScrollPane pg = new JScrollPane(jtbl);
        cnt.add(pg);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        hrtasks obj=new hrtasks();
        this.setVisible(false);
        obj.setVisible(true);
        
    }
    public static void main(String[] args) {
        JFrame frame = new saldetails();
        frame.setTitle("Salary details");
        frame.setSize(500,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
