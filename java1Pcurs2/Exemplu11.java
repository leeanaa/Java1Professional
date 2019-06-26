import java.nio.file.*;
import java.util.stream.*;

public class Exemplu11 {
    public static void main(String [] args) throws Exception {
        
        Path p = Paths.get(".");
        
        Stream<Path> paths = Files.walk(p);
        paths.forEach(p1 -> System.out.println(p1));
    }
}