/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr;

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
public class product2 {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String post;
    private String sal;
    private byte[] Image;
    
   
    
    public product2(int id, String name, String phone, String email,String post,String sal,byte[] image){
    
        this.id = id;
        this.name = name;
        this.phone= phone;
        this.email = email;
        this.post=post;
        this.sal=sal;
        this.Image = image;
        
       
    }

   // product2(String string, String string0, int aInt, String string1, byte[] bytes, int aInt0) {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
    
    
    public int getID(){
      return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getphone(){
        return phone;
    }
    
    public void setphone(String phone){
        this.phone = phone;
    }
    
    public String getemail(){
        return email;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public String getpost(){
        return post;
    }
    
    public void setpost(String post){
        this.post = post;
    }
     public String getsal(){
        return sal;
    }
    
    public void setsal(String sal){
        this.sal = sal;
    }
    
    public byte[] getMyImage(){
        return Image;
    }
}


