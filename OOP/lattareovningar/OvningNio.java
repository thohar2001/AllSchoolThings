import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningNio {
    public static void main(String[] args) {
        String longestName = "";
        String shortestName = "";

        List<String> listNames = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many names do you want to type in? (max 10): ");

        int amount = scan.nextInt();
        if(amount > 10) {
            amount = 10;
        }
        
        System.out.printf("Skriv in %d namn: %n", amount);

        for(int i = 0; i <= amount; i++) {
            String name = scan.nextLine();
            listNames.add(name);
        }

        for(String names : listNames) {
            if(names.length() > longestName.length()) {
                longestName = names;
                if (shortestName.length() == 0) {
                    shortestName = names;
                }
            }
            else if(names.length() <= shortestName.length()) {
                shortestName = names;
            }
        }
        System.out.println("Shortest name: " + shortestName);
        System.out.println("Longest name: " + longestName);
    }
}
