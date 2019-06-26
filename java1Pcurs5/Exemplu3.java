import java.util.concurrent.*;

public class Exemplu3 {
    
    public static void main(String [] args) {
        ExecutorService service =         
                Executors.newCachedThreadPool();
                
        Task1 task = new Task1();
        service.execute(task);
        service.execute(task);
        service.execute(task);
        
        service.shutdown();
        //service.shutdownNow();
        
        
        
    }
}