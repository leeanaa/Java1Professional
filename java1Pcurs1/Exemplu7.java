import java.io.*;

public class Exemplu7 {
    public static void main(String [] args) {
        
        try (FileInputStream fis = new FileInputStream("mitzi.srz");
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis)) {
                 
             Pisica p = (Pisica) ois.readObject();
             System.out.println(p);
                 
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}