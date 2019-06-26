public class Exemplu11 {
    public static void main(String [] args) {
        EvenNumbersRunnable r = new EvenNumbersRunnable();
        Thread t1 = new Thread(r);
        
        
        //t1.start();
        
        Object o1 = new Object();
        Object o2 = new Object();
        new Thread(() -> m1(o1, o2)).start();
        new Thread(() -> m2(o1, o2)).start();
        
        System.out.println("end main");
    }
    
    static void m1(Object o1, Object o2) {
        synchronized (o1) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
            System.out.println("m1 : astept dupa semaforul o2");
            synchronized (o2) {
                System.out.println("m1");
            }            
        }
    }
    
    static void m2(Object o1, Object o2) {
        synchronized (o2) {
            System.out.println("m2 : astept dupa semaforul o1");
            synchronized (o1) {
                System.out.println("m2");
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
}