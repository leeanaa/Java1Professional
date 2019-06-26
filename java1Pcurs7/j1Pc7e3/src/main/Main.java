/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/java1pc7e1";
        
        try (Connection con = DriverManager.getConnection(url, "root", "");
             Statement stmt = con.createStatement()) {
            
            String sql = "SELECT * FROM persoane";
            stmt.execute(sql);
            
            ResultSet rs = stmt.getResultSet();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nume = rs.getString("nume");
                String prenume =rs.getString("prenume");
                
                
                System.out.println(id + " " + nume + " " + prenume);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
