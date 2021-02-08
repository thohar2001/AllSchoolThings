import java.util.List;

public class Lambdatesting {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 8);
        int val = numbers.stream().reduce(0, (a, b) -> {
            if (a % 2 == 0) {
                System.out.printf("%d + %d\n", a, b);
                return a + b;
            } else {
                System.out.printf("%d * %d\n", a, b);
                return a * b;
            }
        });
        System.out.println(val);
    }
}
