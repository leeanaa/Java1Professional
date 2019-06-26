import java.util.concurrent.*;

public class Exemplu2 {
    
    public static void main(String [] args) {
        ExecutorService service =         
                Executors.newFixedThreadPool(2);
                
        Task1 task = new Task1();
        service.execute(task);
        service.execute(task);
        service.execute(task);
        
        service.shutdown();
        //service.shutdownNow();
        
        
        
    }
}