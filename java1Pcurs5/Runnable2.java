import java.util.concurrent.locks.*;

public class Runnable2 implements Runnable {
    int x;
    
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock(); 
    
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                printX();
                Thread.sleep(50);
                incrementX();
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void incrementX() {
        lock.writeLock().lock();
        x++;
        lock.writeLock().unlock();
    }
    
    void printX() {
        lock.readLock().lock();
        System.out.println(x);
        lock.readLock().unlock();
    }
    
    
}