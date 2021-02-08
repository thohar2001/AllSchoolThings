import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OvningFem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> peopleHash = new HashSet<>();
        Set<String> peopleTree = new TreeSet<>();

        String name = null;
        System.out.println("Mata in några namn: ");
        do {
            name = scan.nextLine();
            if (name.length() != 0) {
                peopleHash.add(name);
                peopleTree.add(name);
            }
        } while (name.length() != 0);

        System.out.println("This is HashMap: ");
        for(String person : peopleHash) {
            System.out.println(person);
        }

        System.out.println("\n\nThis is TreeMap: ");
        for(String person : peopleTree) {
            System.out.println(person);
        }
    }
}
