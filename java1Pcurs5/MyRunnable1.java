import java.util.concurrent.*;
public class MyRunnable1 implements Runnable{
private int n;
private Semaphore s = new Semaphore(1);
@Override
public void run(){
    try{
        for(int i=0;i<15;i++){
            s.acquire();
            n++;
            System.out.println(n);
            s.release();
        }
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}
}