import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class OvningTva {
    public static void main(String[] args) {
        // Använd HashSet.
        Scanner scan = new Scanner(System.in);
        List<String> people = new ArrayList<>();

        System.out.println("Enter a few contestants for your lottery: ");

        String name;
        do {
            name = scan.nextLine();
            if (name.length() != 0) {
                people.add(name);
            }

        } while (name.length() != 0);

        Random rand = new Random();
        int lotteryNumber = rand.nextInt(people.size());


        String winner = null;
        Iterator<String> itPeople = people.iterator();

        for(int i=0; i <= lotteryNumber; i++) {
            winner = itPeople.next();
        }
        // int i = 0;
        // for(String person : people) {
        //     if (i == lotteryNumber) {
        //         winner = person;
        //     }
        //     i++;
        // }

        System.out.println("The winner is: " + winner);

        scan.close();

        // OvningTre done implicitly
    }
}