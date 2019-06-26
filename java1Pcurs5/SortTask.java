import java.util.concurrent.*;

public class SortTask extends RecursiveTask<int[]> {
    
    
    private int[] list;
    private int start;
    private int end;
    
    public SortTask(int[] list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }
    
    @Override
    protected int[] compute() {
        if (end - start <= 2) {
            java.util.Arrays.sort(list, start, end);
            return list;
        }
        
        int middle = (start + end) / 2;
        SortTask task1 = new SortTask(list, start, middle);
        SortTask task2 = new SortTask(list, middle, end);
        
        task1.fork();
        int[] rez2 = task2.compute();
        
        int[] rez1 = task1.join();
        
        list = merge(list, start, middle, end);
        return list;
    }
    
    private static int[] merge(int[] list, int start, 
                               int middle, int end) {
                            
        int[] copy = new int[end - start];
        
        int i, j;
        int index = 0;
        
        for (i=start, j=middle; i<middle && j<end;) {
            if (list[i] > list[j]) {
                copy[index] = list[j];
                index++;
                j++;
            } else {
                copy[index] = list[i];
                index++;
                i++;
            }
        }
        
        while (i < middle) {
            copy[index] = list[i];
            index++;
            i++;
        }
        
        while (j < end) {
            copy[index] = list[j];
            index++;
            j++;
        }
        
        for (int k = start; k < end; k++) {
            list[k] = copy[k-start];
        }
        
        return list;
    }
    
    
} 


