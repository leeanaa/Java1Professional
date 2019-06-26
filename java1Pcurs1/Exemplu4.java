import java.io.*;

public class Exemplu4 {
    public static void main(String [] args) {
        
        try (BufferedReader br = new BufferedReader(
                    new FileReader("Exemplu3.java")
             );
             PrintWriter pw = new PrintWriter("Exemplu3-copie.java")) {

             String line;    
                 
             while ((line = br.readLine()) != null) {
                pw.println(line);
                
             }
             
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}