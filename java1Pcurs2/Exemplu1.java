import java.io.*;

public class Exemplu1 {
    
    public static void main(String [] args) {
        File f = new File("./A");
        
        f.mkdir();
        
        File f1 = new File("./A/B/C");
        System.out.println(f1.mkdirs());
    }
}