import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComputerApp {

    public static void printComputers(List<Computer> comps) {
        int i = 1;
        for(Computer comp : comps) {
            System.out.printf("%d. \n"+comp, i);
            System.out.println("\n");
            i++;
        }
    }
    public static void main(String[] args) {
        
        Computer c = new Computer("Dell Byteswerver", 4.5, 16, 1000);
        Computer c2 = new Computer("Taurus Elitegaming xc400", 5.7, 16, 2000);
        Computer c3 = new Computer("Alienware Badcomputer 3000", 2.7, 8, 500);
        Computer c4 = new Computer("Dell Byteswerver 2.0", 4.5, 16, 1000);

        List<Computer> computers = new ArrayList<>();
        computers.add(c3);
        computers.add(c2);
        computers.add(c);

        System.out.println("Not compared: \n");
        printComputers(computers);


        System.out.println("Sorted: ");
        Collections.sort(computers, Collections.reverseOrder());

        printComputers(computers);

        System.out.println("\n");

        Collections.sort(computers, new HarddriveComparator());

        System.out.println("Sorted with Comparator: ");

        printComputers(computers);
        
        System.out.println(c.compareTo(c4));
        // for(Computer comps : computers) {
        //     System.out.println(comps);
        // }

    }
}
