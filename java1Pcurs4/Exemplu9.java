import java.util.*;
import java.util.stream.*;

public class Exemplu9 {
    
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(0, 1, -1, 2, 4, 1, 10, 9);
        
        Map<Boolean, List<Integer>> map = 
            list.stream()
                .collect(Collectors.partitioningBy(
                    i -> i % 2 == 0
                ));
                
        System.out.println(map);
    }
}