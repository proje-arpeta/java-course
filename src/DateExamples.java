
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateExamples {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("today " + today);

        LocalDate createdDate = LocalDate.parse("2024-09-30");
        System.out.println("createdDate " + createdDate);

        LocalTime time = LocalTime.now();
        System.out.println("Time " + time);

        LocalTime createdTime = LocalTime.parse("09:00:00");
        System.out.println("createdTime  " + createdTime );

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("dateAndTime  " + dateAndTime);

        LocalDate meetingDate = LocalDate.of(2024,07, 13);
        LocalTime meetingTime = LocalTime.of(10,30, 15);

        LocalDateTime meetingDateAndTime =LocalDateTime.of(meetingDate, meetingTime);
        LocalDateTime meetingDateAndTime2 =LocalDateTime.of(2024, 3,21,8, 10);
        System.out.println("meetingDateAndTime " + meetingDateAndTime);
        System.out.println("meetingDateAndTime2 " + meetingDateAndTime2);


        LocalDateTime expireDate = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy mm:HH");
        String expireDateFormated = expireDate.format(format);
        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd-MM");
        System.out.println("expire Date Format => " + expireDateFormated );
        String dayAndMonth = today.format(dateFormater);
        System.out.println("Date And Mont => " + dayAndMonth );
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("mm");
        String timeString = time.format(timeFormatter);
        System.out.println("Dakika" + timeString);

        // Ay-gün-yil MM-dd-yyyy
        //time HH:mm
        // Date Time dd-MM mm




    }
}
