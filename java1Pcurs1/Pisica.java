public class Pisica extends Animal implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    transient String nume = "tom";
    String culoare;
    int varsta;
    
    int greutate;
    boolean pedigree;
    
    public Pisica(String nume, String culoare, int varsta, int greutate) {
        this.nume = nume;
        this.culoare = culoare;
        this.varsta = varsta;
        this.greutate = greutate;
        System.out.println("c-tor pisica");
    }
    
    @Override
    public String toString() {
        return nume + " " + culoare + " " + varsta + " " + greutate
                + " " + pedigree;
    }
}