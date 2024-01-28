//We are also known as is this package is Joda time Api  It is Introduce in java8
import java.time.*;
public class dateAndTimejava8 {
    public static void main(String[] args) {

        LocalDate date=LocalDate.now();
        System.out.println(date);

        //We are use many inbuilt methods .That is prent in Local date class
        //or locla time class
       int  day=date.getDayOfMonth();

       int month=date.getMonthValue();

       int year =date.getYear();

        System.out.println(day+"/"+month+"/"+year);

        System.out.println("***********************************************");
        LocalTime time=LocalTime.now();
        System.out.println(time);

        int hour=time.getHour();
        int minute=time.getMinute();
        int second=time.getSecond();
        System.out.println(hour+":"+minute+":"+second);

    }
}
