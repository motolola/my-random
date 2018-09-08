package random;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {

    public static void main(String[] args){

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime ourTime = LocalTime.now();
        System.out.println(ourTime);

        LocalDateTime ourDateTime = LocalDateTime.now();
        System.out.println(ourDateTime);
        System.out.println(ourDateTime.format(DateTimeFormatter.ofPattern("d:m:y")));
    }

}