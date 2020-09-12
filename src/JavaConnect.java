/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUMAN DHUNGANA
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    Connection con;
    
    public static Connection connectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem?zeroDateTimeBehavior=convertToNull", "root", "");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
            return null; 
        }
    }
}
