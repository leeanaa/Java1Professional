import java.util.*;

public class Exemplu10 {
    public static void main(String [] args) {
        
        Optional<String> o1 = Optional.empty();
        Optional<String> o2 = Optional.of("Hello"); // parametrul lui
                                // "of" nu trebuie sa fie null
                                
        Optional<String> o3 = Optional.ofNullable(null);
        
        System.out.println(o3.isPresent());
        
        o2.ifPresent(s -> System.out.println(s));
        
        String s1 = o2.get(); // va arunca o exceptie daca 
                              // Optional-ul este gol
        
        String s2 = o1.orElse("nimic");
        System.out.println(s2);
                              
        String s3 = o3.orElseGet(() -> "tot nimic");
        
        String s4 = o1.orElseThrow(() -> new NullPointerException("null detectat"));
        
    }
}