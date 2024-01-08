import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        // Get the current time in your location
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local time: " + localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // Get the offset between your location and USA
        ZoneId yourZoneId = ZoneId.systemDefault();
        ZoneId usaZoneId = ZoneId.of("America/New_York");
        ZonedDateTime yourZonedDateTime = ZonedDateTime.of(localDateTime, yourZoneId);
        ZonedDateTime usaZonedDateTime = yourZonedDateTime.withZoneSameInstant(usaZoneId);
        System.out.println("Offset to USA: " + yourZonedDateTime.getOffset().compareTo(usaZonedDateTime.getOffset()));
    }
}