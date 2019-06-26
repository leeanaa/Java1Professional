import java.nio.file.*;

public class Exemplu5 {
    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B");
        Path p2 = Paths.get("C:/X/Y");
        
        Path p3 = p1.resolve(p2);
        System.out.println(p3);
    }
}