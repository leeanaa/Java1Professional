import java.util.concurrent.*;

public class Exemplu5 {
    public static void main(String [] args) {
        
        ScheduledExecutorService service = 
                Executors.newScheduledThreadPool(1);
        
        Task1 task = new Task1();
        
        //service.schedule(task, 5, TimeUnit.SECONDS);
        System.out.println(java.time.Instant.now());
        
        //service.scheduleWithFixedDelay(task, 1, 10, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(task, 1, 10, TimeUnit.SECONDS);
        
        //service.shutdown();
    }
    
    
    
    
}