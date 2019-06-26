import java.nio.file.*;

public class Exemplu3 {
    public static void main(String [] args) {
        
        Path p1 = Paths.get("./A/B");
        
        System.out.println(p1);
        System.out.println(p1.getClass());
    }
}