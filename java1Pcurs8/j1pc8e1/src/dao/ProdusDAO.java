/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produs;

/**
 *
 * @author student
 */
public class ProdusDAO {
    private Connection con;

    public ProdusDAO(Connection con) {
        this.con = con;
    }
    
    public boolean create(Produs p) {
        String sql = "INSERT INTO produse VALUES (NULL, ?, ?, ?)";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, p.getNume());
            stmt.setInt(2, p.getPret());
            stmt.setInt(3, p.getUserId());
            
            return stmt.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(ProdusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Produs> findProduseByUserId(int userId) {
        List<Produs> produse = new ArrayList<>();
        String sql = "SELECT * FROM produse WHERE user_id = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Produs p = new Produs(
                        rs.getInt("id"),
                        rs.getString("nume"),
                        rs.getInt("pret"),
                        rs.getInt("user_id")
                );
                produse.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produse;
    }
    
    public boolean delete(Produs p) {
        String sql = "DELETE FROM produse WHERE id = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, p.getId());
            
            return stmt.executeUpdate() != 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
