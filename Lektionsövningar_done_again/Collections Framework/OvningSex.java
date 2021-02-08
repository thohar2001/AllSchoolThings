import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a few numbers (0 to quit)");
        do {
            number = scan.nextInt();
            if (number != 0) {
                numbers.add(number);
            }
        } while (number != 0);

        ListIterator<Integer> numbersIterator = numbers.listIterator(numbers.size());
  
        while(numbersIterator.hasPrevious()) {
            System.out.println(numbersIterator.previous());
            if(numbersIterator.hasPrevious()) {
                numbersIterator.previous();
            }
            
        }
    }
}
