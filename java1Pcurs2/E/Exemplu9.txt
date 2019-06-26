import java.nio.file.*;

public class Exemplu9 {
    public static void main(String [] args) throws Exception {
        
        Path p1 = Paths.get("./Exemplu9.java");
        Path p2 = Paths.get("./E/Exemplu9.txt");
        
        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
        
    }
}