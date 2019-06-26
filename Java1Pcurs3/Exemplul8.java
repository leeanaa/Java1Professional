import java.util.*;
public class Exemplul8 {
    public static void main(String [] args){
        List <String> list = Arrays.asList("aaa","bb","cccc","d","ee");
        String s =
        list.stream()
            .reduce(" ", (a,b)->a+b);
        System.out.println(s);
            
    }
}