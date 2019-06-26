import java.io.*;

public class Exemplu2 {
    
    public static void main(String [] args) throws Exception {
        File f = new File("./A/B/fisier");
        
        f.createNewFile();
        
        System.out.println(f.length());
        System.out.println(f.exists());
        
        File f1 = new File(".");
        File[] fa = f1.listFiles();
        for (File f2 : fa) {
            System.out.println(f2);
        }
        
        f.delete();
    }
    
    
    
    
    
    
}