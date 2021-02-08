import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class OvningTre {
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

        list.stream().map(s -> s.replaceAll("\\s+", "")).forEach(System.out::println);

        
            
    }
}