import java.util.stream.*;

public class EvenNumbersRunnable implements Runnable {
    
    @Override
    public void run() {
        Stream.iterate(0, i -> i + 2)
              .limit(25)
              .forEach(System.out::println);
    }
}