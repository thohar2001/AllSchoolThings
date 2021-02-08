import java.io.IOException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int value = 0;
            System.out.println("enter value 0 - 10: ");
            value = scan.nextInt();

            if (value > 10) {
                throw new IllegalArgumentException("Value must be under 10.");
            }
            else if (value < 0) {
                throw new RuntimeException("Value must be over 0");
            }
            else {
                System.out.println(value);
            }
        }

        catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }

        catch (RuntimeException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

