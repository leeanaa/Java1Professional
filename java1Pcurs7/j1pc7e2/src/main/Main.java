/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;
        String url = "jdbc:mysql://localhost/java1pc7e1";
        String user = "root";
        String password = "";
        
        try {
            con = DriverManager.getConnection(url, user, password);
            
            String sql = "INSERT INTO persoane VALUES (NULL, 'liana', 'tanasescu')";
            
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            // con si stmt trebuie inchise
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
