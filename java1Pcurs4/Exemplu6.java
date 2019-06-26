import java.util.*;
import java.util.stream.*;

public class Exemplu6 {
    
    public static void main(String [] args) {
        List<Produs> produse = Arrays.asList(
            new Produs("telefon", "electronice", 1500.0),
            new Produs("laptop", "electronice", 2500.0),
            new Produs("frigider", "electrocasnice", 3000.0),
            new Produs("masina de spalat", "electrocasnice", 1500.0),
            new Produs("microunde", "electrocasnice", 500.0),
            new Produs("bluza", "textile", 40.0),
            new Produs("telefon", "electronice", 2000.0),
            new Produs("pantaloni", "textile", 70.0)
        );
        
        Map<String, Double> map = 
            produse.stream()
                   .collect(Collectors.toMap(
                            Produs::getNume, //p -> p.getNume(), 
                            Produs::getPret,  //p -> p.getPret()
                            (oldV, newV) -> newV
                    ));
                
        System.out.println(map);        
                
                
        
        
    }
}