import java.util.Scanner;
import java.lang.StringBuilder;

public class OvningFem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett ord eller mening och kolla om det är ett palindrom: ");
        String line = scan.nextLine();
        
        System.out.println("Palindrom: " + isPalindrome(line));

        scan.close();

    }

    public static boolean isPalindrome(String line) {
        line = line.toLowerCase();
        StringBuilder buildline = new StringBuilder();
        StringBuilder buildPalindrome = new StringBuilder();
        boolean isTrue = false;
    
        /** 
         * här bygger jag upp en sträng utan mellanslag. Character.isAlphabetic kollar om tecknet är en bokstav eller inte.
         * nu ska det funka även med skiljetecken.
        */
        for(int i = 0; i < line.length(); i++) {
            if(Character.isAlphabetic(line.charAt(i))) {
                buildline.append(line.charAt(i));
            }
        }
        line = buildline.toString();

        /**
         * här bygger jag upp strängen (line) baklänges och jämför sedan den strängen med den ursprungliga line
         */
        for(int i = line.length()-1; 0 <= i; i--) {
            buildPalindrome.append(line.charAt(i));
        }

        if(line.equals(buildPalindrome.toString())) {
            isTrue = true;
        }

        return isTrue;
        
    }
}