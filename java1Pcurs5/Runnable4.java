import java.util.concurrent.atomic.*;

public class Runnable4 implements Runnable {
    
    AtomicInteger x = new AtomicInteger(0);
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(x.getAndIncrement());
                Thread.sleep(50);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}