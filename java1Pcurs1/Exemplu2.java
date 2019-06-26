import java.io.*;

public class Exemplu2 {
    public static void main(String [] args) {
        
        try (FileReader fr = new FileReader("Exemplu2.java");
             BufferedReader br = new BufferedReader(fr)) {
        
             String line;
             
             while ((line = br.readLine()) != null) {
                 System.out.println(line);
             }
                 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}