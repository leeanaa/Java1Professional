import java.util.*;

public class Exemplul13 {
    public static void main(String [] args){
        
        Locale l1 = new Locale ("en_UK");
        
        Locale l2 = new Locale.Builder()
                              .setRegion("US")
                              .setLanguage("en")
                              .build();
        System.out.println(l2);
        
        Locale l3 = Locale.FRANCE;
        
        System.out.println(l3);
        
        Locale ld = Locale.getDefault();
        System.out.println(ld);
        
        Locale.setDefault(l3);
        
        ResourceBundle rb = ResourceBundle.getBundle ("traduceri",l2);//cauta traduceri_en_US.
        //daca nu gaseste cata ceva mai genearal traduceri_en, daca nu in traduceri
        //daca pun locale.GERMANY gaseste ce am pus eu default(l3)
        //daca nu gaseste nimic exceptie
        String hello = rb.getString ("msgHello");
        System.out.println (hello);
    }
}