import java.sql.Date;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex3 {
    public static void main(String[] args) {
        ZoneId sweden = ZoneId.of("Europe/Stockholm");
        ZonedDateTime zdtswe = ZonedDateTime.now(sweden);
        ZoneId ny = ZoneId.of("America/New_York");
        ZonedDateTime zdtny = ZonedDateTime.now(ny);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm");

        System.out.println("Klockan i Götet: " + zdtswe.format(dtf));
        System.out.println("Klockan i NY: " + zdtny.format(dtf));
    }
}
