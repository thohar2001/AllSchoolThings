import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex2 {
    public static void main(String[] args) {
        LocalDate inAMonth = LocalDate.now().plusMonths(1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(inAMonth.format(dtf));
    }
}
