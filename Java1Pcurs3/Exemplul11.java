import java.time.*;
public class Exemplul11 {
    public static void main(String [] args){
        ZoneId.getAvailableZoneIds()
              .stream()
              .forEach (e->System.out.println(e));
        ZoneId zi = ZoneId.of("Asia/Singapore");
        ZonedDateTime zdt1 = ZonedDateTime.now(zi);
        System.out.println(zdt1);
        ZonedDateTime zdt2 = ZonedDateTime.now( );
        System.out.println(zdt2);
    }
}