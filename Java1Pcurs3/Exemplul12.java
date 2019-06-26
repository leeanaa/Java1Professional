import java.time.*;
public class Exemplul12 {
    public static void main (String [] args){
        LocalDate ld1 = LocalDate.now();
        
        Period p1 = Period.ofWeeks(2);//afiseaza 14 zile
        p1.plusDays(3);//nu adauga pt ca p1 e imutabila
        System.out.println(p1);
        
        p1=p1.plusDays(3);//acum adauga e zile
        
        LocalDate ld2 = ld1.minus(p1);
        System.out.println(ld2);
        
        Duration d1 = Duration  .ofHours(2)
                                .ofMinutes(40)
                                .ofSeconds(30);
        System.out.println(d1);                     
                                
        Duration d2 = Duration.ofHours(2);
        d2 = d2.plusMinutes(40);
        d2 = d2.plusSeconds(10);
        
        System.out.println(d2);
        
        //extrag GMT-ul si pune un Z la sfarsit
        Instant i = Instant.now();
        System.out.println(i);
    }
}