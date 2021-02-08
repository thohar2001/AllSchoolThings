import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OvningFem {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String name = null;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter names (enter to continue): ");
            do {
                name = scan.nextLine();
                if (!name.isBlank()) {
                    list.add(name);
                }
            } while (!name.isBlank());
        }

        List<String> filteredNames = list.stream()
                                         .filter(d -> d.length() > 1)
                                         .filter(d -> d.charAt(1) != 'a')
                                         .map(d -> d.replaceAll("\\s+", ""))
                                         .map(String::toLowerCase)
                                         .collect(Collectors.toList());

        
        
        for (String names : filteredNames) {
            System.out.println(names);
        }
    }
}