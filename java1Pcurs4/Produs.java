public class Produs {
    private String nume;
    private String categorie;
    private double pret;
    
    public Produs(String nume, String categorie, double pret) {
        this.nume = nume;
        this.categorie = categorie;
        this.pret = pret;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public String getCategorie() {
        return categorie;
    }
    
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    
    public double getPret() {
        return pret;
    }
    
    public void setPret(double pret) {
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return nume + " " + pret;
    }
    
}