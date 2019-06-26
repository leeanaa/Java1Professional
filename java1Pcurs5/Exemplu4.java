import java.util.concurrent.*;

public class Exemplu4 {
    public static void main(String [] args) throws Exception {
        
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        DownloaderTask task = new DownloaderTask();
        
        Future<String> f = service.submit(task);
        
        System.out.println("Se executa mai departe metoda main");
        System.out.println(f.isDone());
        
        System.out.println("Astept rezultatul...");
        String rez = f.get();
        
        System.out.println(rez);
        
        service.shutdown();
    }
}