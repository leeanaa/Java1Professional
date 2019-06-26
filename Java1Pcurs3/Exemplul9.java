import java.util.*;
public class Exemplul9 {
    public static void main(String [] args){
        List <String> list = Arrays.asList("aaa","bb","cccc","d","ee");
        long nr = 
        list.stream()
            .map(s->s.split("\\s*"))//metoda split returneaza un string array String - >String[]
            .map(sa ->Arrays.asList(sa))
            .flatMap(ls->ls.stream())//am un stream de stream-uri daca fol doar map..flat map concateneaza stream-uri
            .filter(c->"aeiou".contains(c))
            .count();
            //.forEach(System.out::println);
        System.out.println(nr);    
    }
}