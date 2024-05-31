import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTimeExamples {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Time " + time);
        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("Date and Time " + dateAndTime );
        LocalDate expireDate = LocalDate.of(2024,7,14);
        System.out.println("Expire DAte" + expireDate);
        LocalTime expireTime = LocalTime.of(10,20,30);
        System.out.println("Expire Time" + expireTime);
        LocalTime expireTime2 = LocalTime.of(10,30);
        System.out.println("Expire Time 2" + expireTime2);

        LocalDateTime expireFullDate = LocalDateTime.of(expireDate, expireTime);
        System.out.println("Expire fulll date" + expireFullDate);
        LocalDateTime expireFUllDate2 = LocalDateTime.of(2024, 8 , 13,15,30 );

        System.out.println("Expire fulll date 2" + expireFUllDate2);

        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        DateTimeFormatter formatDateAndTime = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH");
        String expireDateFormatted = expireFullDate.format(formatDate);
        String expireDateFormatWithTime = expireFullDate.format(formatDateAndTime);
        System.out.println(expireFullDate);
        System.out.println(expireDateFormatted);
        System.out.println(expireDateFormatWithTime);

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
        String formatttedTime = expireTime.format(timeFormat);
        System.out.println(formatttedTime);
        String formattedDate = expireDate.format(formatDate);
        System.out.println(formattedDate);
;    }
}
