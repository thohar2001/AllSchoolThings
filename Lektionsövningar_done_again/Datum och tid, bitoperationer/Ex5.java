import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        String date;
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter year of birth (yyyy-mm-dd): ");
            date = scan.nextLine();
        }

        LocalDate ldnow = LocalDate.now();
        LocalDate ldbirthday = LocalDate.parse(date);


        long days = ChronoUnit.DAYS.between(ldbirthday, ldnow);
        if (days < 0) {
            System.out.println("You can't be born in the future...");
        } else {
            System.out.printf("You are: %d days old.", days);
        }

        


        
        
    }
}
