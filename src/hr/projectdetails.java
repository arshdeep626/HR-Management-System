
package hr;

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
public class projectdetails extends JFrame  implements ActionListener{
     DefaultTableModel model = new DefaultTableModel();
    Container cnt = this.getContentPane();
    JTable jtbl = new JTable(model);
    JButton bt1=new JButton("back");
    public projectdetails() {
        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
        model.addColumn("projectname");
        model.addColumn("clientname");
        model.addColumn("projecttype");
        model.addColumn("projectmanager");
        model.addColumn("developingplatform");
        model.addColumn("databse");
        model.addColumn("projectdescription");
        this.add(bt1);
        bt1.addActionListener(this);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM project");
            ResultSet Rs = pstm.executeQuery();
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(6),Rs.getString(7),Rs.getString(8)});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JScrollPane pg = new JScrollPane(jtbl);
        cnt.add(pg);
        this.pack();
    }
    public static void main(String[] args) {
        JFrame frame = new projectdetails();
        frame.setTitle("PROJECT DETAILS");
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         hrtasks obj=new hrtasks();
         this.setVisible(false);
         obj.setVisible(true);
    }
    
}
