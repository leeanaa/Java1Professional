import java.util.*;
public class Exemplul3{
    public static void main (String []args){
        List <Integer> list = Arrays.asList(1,5,2,6,2,2);
        //creaza o lista imutabila
        //nu pot aplica add
        //colectiile reprezinta cele mai comune surse de date
        //stream-urile rezolva usor niste probleme complicate
        list.stream()
            .filter(i->i%2==0)//fol interfata predicate ret true  pt el pare
            .sorted()
            .distinct()
            .forEach(System.out::println);
        //soretaza si elimina duplicatele
            
    }
}