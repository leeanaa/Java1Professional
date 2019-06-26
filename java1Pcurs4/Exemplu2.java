import java.util.*;
import java.util.stream.*;

public class Exemplu2 {
    public static void main(String [] args) {
        
        List<String> list = Arrays.asList("aa", "bbb", "c", "dddd");
        
        String rez = 
            list.stream()
                .collect(Collectors.joining(", "));
                
        System.out.println(rez);
    }
}