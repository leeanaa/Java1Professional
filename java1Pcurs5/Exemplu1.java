import java.util.concurrent.*;

public class Exemplu1 {
    
    public static void main(String [] args) {
        ExecutorService service = 
        
                Executors.newSingleThreadExecutor();
                
        Task1 task = new Task1();
        service.execute(task);
        service.execute(task);
        System.out.println("Olaa");
        service.execute(task);
        
        service.shutdown();
        //service.shutdownNow();
        
        
        
    }
}