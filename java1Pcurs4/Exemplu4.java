import java.util.*;
import java.util.stream.*;

public class Exemplu4 {
    
    public static void main(String [] args) {
        List<String> list =
                Arrays.asList("aa", "bbb", "c", "dddd", "ee", "f");
                
        Set<Integer> rez = 
            list.stream()
                .map(s -> s.length())
                .collect(Collectors.toSet());
                
        System.out.println(rez);
    }
}