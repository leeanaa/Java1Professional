import java.util.*;
public class Exemplul7 {
    public static void main(String [] args){
        List <String> list = Arrays.asList("aaa","bb","cccc","d","ee");
        int s =
        list.stream()
            .map(String::length)//mapam fiecare string cu lungimea lui
            .reduce(0, (a,b)->a+b);
        System.out.println(s);
            
    }
}