import java.time.*;
public class Exemplul10 {
    public static void main (String [] args){
        LocalDate ld1 = LocalDate.now();//nu se instantiaza prin constructor si exista metode statice
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2019,6,21);
        LocalDate ld3 = LocalDate.of(2019,Month.JUNE,21);
        
        System.out.println(ld1.isBefore(ld2));
        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld2.equals(ld3));
        
        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(14,30);
        //LocalTime lt3 = LocalTime.of(14,30,61);//exceptie DateTimeException
        
        LocalDateTime ltd1 = LocalDateTime.now();
        System.out.println(ltd1);
        LocalDateTime ltd3 = LocalDateTime.of(2019,6,21,20,29);
        LocalDateTime ltd4 = LocalDateTime.of(ld1,lt1);
    }
}