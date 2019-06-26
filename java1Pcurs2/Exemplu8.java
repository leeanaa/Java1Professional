import java.nio.file.*;
import java.io.*;

public class Exemplu8 {
    public static void main(String [] args) throws Exception {
        Path p = Paths.get("./Y");
        
        if (!Files.exists(p)) {
            Files.createDirectory(p);
        } else {
            System.out.println("Fisierul exista deja");
        }
        
        
        Path p1 = Paths.get("./E/F/G");
        
        if (Files.notExists(p1)) {
            Files.createDirectories(p1);
        }
        
        Path p2 = Paths.get("./E/fis.txt");
        if (Files.notExists(p2)) {
            Files.createFile(p2);
        }
        
        System.out.println(Files.size(p2));
        
    }
}