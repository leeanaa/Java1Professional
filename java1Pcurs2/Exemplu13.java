import java.nio.file.*;
import java.util.stream.*;

public class Exemplu13 {
    public static void main(String [] args) throws Exception {
        
        Path p = Paths.get(".");
        
        Stream<Path> paths = 
            Files.find(p, Integer.MAX_VALUE, 
            (p1, a) -> p1.toString().endsWith(".java"));
        
        
            
            
            
            
            
        paths.forEach(p1 -> System.out.println(p1));
    }
}