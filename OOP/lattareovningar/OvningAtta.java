import java.util.Scanner;

public class OvningAtta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många tal vill du skriva in? (max 10)");
        int amount = scan.nextInt();

        int highestNumber = 0;
        int lowestNumber = 0;

        int[] tal = new int[0];
        
        if (amount > 10) {
            tal = new int[10];
            amount = 10;
        }
        else {
            tal = new int[amount];
        }
        
        System.out.println("Skriv in dina tal: ");

        for(int i = 0; i < amount; i++) {
            tal[i] = scan.nextInt();
        }
        for(int arraynumbers : tal) {
            if(arraynumbers > highestNumber) {
                highestNumber = arraynumbers;
                if (lowestNumber == 0) {
                    lowestNumber = arraynumbers;
                }
            }
            else if(arraynumbers <= lowestNumber) {
                lowestNumber = arraynumbers;
          }
        }
        System.out.println("lowest: " + lowestNumber);
        System.out.println("highest: " + highestNumber);
    }
}
