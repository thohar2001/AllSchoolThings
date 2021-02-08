import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex4 {
    public static void main(String[] args) {
        LocalDate ldnow = LocalDate.now();
        LocalDate ldnextYear = LocalDate.of(LocalDate.now().getYear()+1, 1, 1);
        long days = ChronoUnit.DAYS.between(ldnow, ldnextYear);

        System.out.println("Days to next year: " + days);
    }
}
