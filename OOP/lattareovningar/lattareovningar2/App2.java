import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        List<Operation> operations = new ArrayList<>();
        operations.add(new Maximum());
        operations.add(new Minimum());
        operations.add(new Sum());
        operations.add(new Average());

        int[] values = new int[4];
        System.out.println("Skriv in 4 tal: ");
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < values.length; i++) {
            int value = scan.nextInt();
            values[i] = value;
        }
        System.out.println("");
        for(Operation funcs : operations) {
            System.out.println(funcs.operation(values)); 
            System.out.println(funcs.getName());
        }
    }
}
