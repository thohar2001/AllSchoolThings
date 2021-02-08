import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Ex7 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatStart = dtf.format(lt);
        System.out.println("Clock at start: " + formatStart);

        try {
            Thread.sleep(300000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        LocalTime ltEnd = LocalTime.now();
        String formatEnd = dtf.format(ltEnd);
        System.out.println("Clock after 5 minutes: " + formatEnd);

    }
}
