import java.nio.file.*;

public class Exemplu7 {
    public static void main(String[] args) {
        
        Path p = Paths.get("A/./../B/C/X/../D/./././Y/D/../../..");
        
        Path simpleP = p.normalize();
        System.out.println(simpleP);
    }
}