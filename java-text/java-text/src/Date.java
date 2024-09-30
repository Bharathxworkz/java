import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {


        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime time = LocalTime.now();

        String dateFormat = "dd/MM/yyyy";
        String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
        String timeFormat = "HH:mm:ss";


        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(dateFormat);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormat);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(timeFormat);

        String formattedDate = date.format(dateFormatter);
        String formattedDateTime = dateTime.format(dateTimeFormatter);
        String formattedTime = time.format(timeFormatter);

        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
        System.out.println("Formatted Time: " + formattedTime);
    }
}
