import java.util.*;
import java.util.stream.*;

public class Exemplu5 {
    
    public static void main(String [] args) {
        List<String> list =
                Arrays.asList("aa", "bbb", "c", "dddd", "ee", "f");
                
        List<Integer> rez = 
            list.stream()
                .map(s -> s.length())
                .collect(Collectors.toCollection(ArrayList::new)); //() -> new ArrayList<>()
                
        System.out.println(rez);
    }
}