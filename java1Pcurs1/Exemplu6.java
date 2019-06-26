import java.io.*;

public class Exemplu6 {
    public static void main(String [] args) {
        
        
        Pisica p = new Pisica("Mitzi", "alb", 65, 3);
        
        
        try (FileOutputStream fos = new FileOutputStream("mitzi.srz");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
             
             oos.writeObject(p);   
             
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}