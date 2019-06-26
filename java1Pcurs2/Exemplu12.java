import java.nio.file.*;
import java.util.stream.*;

public class  Exemplu12 {
    public static void main(String [] args) throws Exception {
        
        Path p = Paths.get(".");
        
        Stream<Path> paths = Files.list(p);
        paths.forEach(p1 -> System.out.println(p1));
    }
}