import java.util.function.*;
public class Exemplul1 {
    public static void main (String [] args){
        BinaryOperator<Integer> bo1 = new BinaryOperator<Integer>(){
            @Override
            public Integer apply(Integer i1,Integer i2){
            return i1+i2;
        }
        };
        System.out.println(bo1.apply(2,2));
        
        BinaryOperator<Integer> bo2 = (i1,i2)->i1+i2;
        Consumer<Integer> c1 = x ->System.out.println(x);
        //e ca o scriere prescurata..ce primeste da ma departe,un fel de delagare
        Consumer<Integer> c2 = System.out::println;
    }
}