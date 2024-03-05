package basics.dateandcalender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        String dateString = "2023-03-04";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(dateString, formatter);         //formats as the pattern above
//        LocalDate localDate = LocalDate.now();      //Shows current date
        System.out.println(localDate);

        String dateTimeString = "2024-03-04 13:00:53";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println(localDateTime);
    }
}
