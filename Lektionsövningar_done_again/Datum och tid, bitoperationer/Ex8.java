import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex8 {
    public static void main(String[] args) {
        // the real Ex7

        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(dtf));
        int minutesLeft = 5 - (time.getMinute() % 5);

        LocalTime atFive = time.plusMinutes(minutesLeft).truncatedTo(ChronoUnit.MINUTES);
        long milliSecondsLeft = ChronoUnit.MILLIS.between(time, atFive);

        try {
            Thread.sleep(milliSecondsLeft);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(LocalTime.now().format(dtf));
    }
}
