import java.nio.file.*;
import java.util.*;

public class Exemplu10 {
    public static void main(String [] args) throws Exception {
        
        Path p = Paths.get("./Exemplu10.java");
        
        List<String> lines = Files.readAllLines(p);
        lines.forEach(l -> System.out.println(l));
    }
}