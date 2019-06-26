import java.io.*;

public class Exemplu3 {
    public static void main(String [] args) {
        
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             PrintWriter pw = new PrintWriter("out.txt")) {
                 
             String line;
             
             while (!(line = br.readLine()).equalsIgnoreCase("end")) {
                 pw.println(line);
             }
                 
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        
    }
}