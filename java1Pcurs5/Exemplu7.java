import java.util.concurrent.*;

public class Exemplu7 {
    public static void main(String [] args) {
        
        int[] list = {5, 3, -1, 8, 3, 8, 2};
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<int[]> task = 
            new SortTask(list, 0, list.length);
            
        int[] rez = pool.invoke(task);
        
        System.out.println(java.util.Arrays.toString(rez));
        
    }
}