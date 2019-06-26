import java.util.concurrent.*;

public class Runnable3 implements Runnable {
    
    
    CyclicBarrier barrier = new CyclicBarrier(2);
    
    public void run() {
        String name = Thread.currentThread().getName();
        
        System.out.println(name + " a ajuns la bariera");
        try {
            barrier.await();            
            System.out.println(name + " a trecut de bariera");
            
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
    }
}