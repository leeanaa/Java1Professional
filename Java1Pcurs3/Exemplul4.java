import java.util.*;
public class Exemplul4 {
    public static void main(String [] args){
        List <Integer> list = Arrays.asList(1,5,2,4,5);
        boolean rez =
        list.stream()
            //.anyMatch(i->i%2==0);//daca cel putin un el indepl conditia predicatul ret true
            //.noneMatch(i->i%2==0);//daca nici un el nu indepl cond predicatul ret true
            .allMatch(i->i%2==0);//daca toate el de pe stream ind cond ret true
            System.out.println(rez);
            
    }
}