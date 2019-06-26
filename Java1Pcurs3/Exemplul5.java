import java.util.*;
public class Exemplul5 {
    public static void main(String [] args){
        List <String> list = Arrays.asList("aaa","bb","cccc","d","ee");
        
        list.stream()
            .filter(s->s.length()%2==0)
            .forEach(System.out::println);
            
    }
}