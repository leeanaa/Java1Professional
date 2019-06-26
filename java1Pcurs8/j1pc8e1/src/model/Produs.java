/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author student
 */
public class Produs {
    private int id;
    private String nume;
    private int pret;
    private int userId;

    public Produs(int id, String nume, int pret, int userId) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.userId = userId;
    }

    public Produs(String nume, int pret, int userId) {
        this.nume = nume;
        this.pret = pret;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" + "id=" + id + ", nume=" + nume + ", pret=" + pret + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produs other = (Produs) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
