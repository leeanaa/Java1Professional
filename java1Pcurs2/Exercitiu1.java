import java.io.*;

public class Exercitiu1 {
    
    public static void main(String [] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr)) {
        
             String line;
             String [] input;
             
             while (true) {
                 
                line = br.readLine();
                input = line.split("\\s+");
                
                switch (input[0].toUpperCase()) {
                    case "CD" : 
                        File f1 = new File(input[1]);
                        f1.mkdirs();
                        break;
                    case "CF" : 
                        File f2 = new File(input[1]);
                        f2.createNewFile();
                        break;
                    case "LIST" : 
                        File f3 = new File(input[1]);
                        for (File f : f3.listFiles()) {
                            System.out.println(f);
                        }
                        break;
                    case "DELETE" :
                        File f4 = new File(input[1]);
                        f4.delete();
                        break;
                    case "EXIT" :
                        System.exit(0);
                        break;
                }
             }
                 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}