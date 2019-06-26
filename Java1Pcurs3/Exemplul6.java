import java.util.*;
public class Exemplul6 {
    public static void main(String [] args){
        List <String> list = Arrays.asList("aaa","bb","cccc","d","ee");
        /*
        *Stream-->map-->Stream
        *Stream-->mapToInt-->IntStream
        *Stream-->mapToDouble-->DoubleStream
        *IntStream-->mapToLong-->LongStream
        *IntStream-->mapToObject-->Stream
        */
        
        //list.stream()
            //.map(s -> s.length())//imi ret tot un stream ,map primeste un function (S e tip String)
            //.forEach(System.out::println);
        //afisez maximul lungimilor de stringuri
        int max =   
        list.stream()
            .mapToInt(String::length)//s->s.length()
            .max()
            .getAsInt();
            
        System.out.println(max);
            
    }
}