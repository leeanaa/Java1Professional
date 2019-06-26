import java.util.stream.*;
public class Exemplul2 {
    public static void main (String [] args){
        //cum creem o sursa de3 date
        Stream<Integer> s1 = Stream.empty();
        Stream<Integer> s2 = Stream.of(3,5,1,6,2,2);
        //generam stream-uri infinite
        Stream<Integer> s3 = Stream.iterate(1,i->i+2);//fol unaryoperator
        Stream<Integer> s4 = Stream.generate(()->1);//fol suplier
        
        s2.forEach(System.out::println);
        //primeste un consumator ca param
        //s2 a pornit pt ca i-am dat op terminala
        s3.limit(10)
          .forEach(System.out::println);//le consum cu op terminala
       
    }
}