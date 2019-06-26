import java.util.*;

public class Exemplu1 {
    public static void main(String [] args) {
        
        List<Integer> list = Arrays.asList(1, 6, 2, 1, 5, 4, -1, 4, 9, 7);
        
        list.stream()
            .filter(i -> Math.abs(i) % 2 == 1)
            .sorted()
            .distinct()
            .limit(3)
            .forEach(System.out::println);
    }
}