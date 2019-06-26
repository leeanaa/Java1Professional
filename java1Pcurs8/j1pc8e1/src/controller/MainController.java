/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdusDAO;
import dao.UserDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produs;
import model.User;

/**
 *
 * @author student
 */
public class MainController {
    
    private ProdusDAO produsDao;
    private UserDAO userDao;
    
    private MainController() {
        try {
            String url = "jdbc:mysql://localhost/j1pc8";
            Connection con = DriverManager.getConnection(url, "root", "");
            
            produsDao = new ProdusDAO(con);
            userDao = new UserDAO(con);
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static MainController getInstance() {
        return MainControllerHolder.INSTANCE;
    }
    
    private static class MainControllerHolder {

        private static final MainController INSTANCE = new MainController();
    }
    
    public boolean inregistrare(User u) {
        Optional<User> user = userDao.findUserByUsername(u.getUsername());
        
        if (user.isPresent()) {
            return false;
        }
        
        return userDao.create(u);
    }
    
    public Optional<User> logare(String username, String password) {
        Optional<User> user = userDao.findUserByUsername(username);
        
        if (!user.isPresent()) {
            return Optional.empty();
        }
        
        User u = user.get();
        
        if (!u.getPassword().equals(password)) {
            return Optional.empty();
        }
        
        return user;
    }
    
    public List<Produs> findProduseByUserId(int userId) {
        return produsDao.findProduseByUserId(userId);
    }
    
    public boolean adaugaProdus(Produs p) {
        return produsDao.create(p);
    }
    
    public boolean stergeProdus(Produs p) {
        return produsDao.delete(p);
    }
}
