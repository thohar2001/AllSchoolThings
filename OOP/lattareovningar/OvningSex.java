import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vinnare = new String[3];

        for(int i = 0; i <= 2; i++) {
            System.out.println("Skriv in vinnare " + (i+1));
            vinnare[i] = scan.nextLine();
        }

        System.out.println("Vinstsumman: ");
        int vinst = scan.nextInt();

        for(int j = 0; j <= 2; j++) {
            if(j == 0) {
                System.out.println(vinnare[j] + " vinner " + (vinst/2));
            }
            else{
                System.out.println(vinnare[j] + " vinner " + (vinst/4));
            }
        }
    }
}
