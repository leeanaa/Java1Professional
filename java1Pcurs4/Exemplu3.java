import java.util.*;
import java.util.stream.*;

public class Exemplu3 {
    public static void main(String [] args) {
        
        List<Integer> list = Arrays.asList(1, 6, 2, 1, 5, 4, -1, 4, 9, 7);
        
        List<Integer> rez = 
            list.stream()
                .filter(i -> Math.abs(i) % 2 == 1)
                .sorted()
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
                
        System.out.println(rez);
    }
}