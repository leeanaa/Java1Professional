import java.nio.file.*;

public class Exemplu4 {
    public static void main(String [] args) throws java.io.IOException{
        
        Path p = Paths.get("/A", "B/C", "D");
        
        System.out.println(p.isAbsolute());
        System.out.println(p.getRoot());
        System.out.println(p.toAbsolutePath());
        
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(i + " : " + p.getName(i));
        }
        
        System.out.println(p.getFileName());
        System.out.println(p.toRealPath());
        
        
        
        
        
        
    }
}