import java.io.*;

public class Exemplu5 {
    public static void main(String [] args) {
        
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileOutputStream fos = new FileOutputStream("out.txt", true);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
                 
             String line;
             String enter = "\n";
             
             while (!(line = br.readLine()).equalsIgnoreCase("end")) {
                 bos.write(line.getBytes(), 0, line.length());
                 bos.write(enter.getBytes(), 0, enter.length());
             }
                 
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        
    }
}