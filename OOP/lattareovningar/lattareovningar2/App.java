import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Maximum max = new Maximum();
        Minimum min = new Minimum();
        
        int[] values = new int[4];
        System.out.println("Skriv in 4 tal: ");
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < values.length; i++) {
            int value = scan.nextInt();
            values[i] = value;
        }
        System.out.println("Vill du räkna ut: \n - minimum \n - maximum");
        scan.nextLine();
        String choice = scan.nextLine();
        choice.toLowerCase();

        if(choice.equals("minimum")) {
            System.out.println("Det minsta värdet i listan är: " +  min.operation(values));
        }
        else if(choice.equals("maximum")) {
            System.out.println("Det största värdet i listan är: " +  max.operation(values));
        }
        else{
            System.out.println("Du valde inte något av alternativen. Stänger av.");
        }
    }
}
