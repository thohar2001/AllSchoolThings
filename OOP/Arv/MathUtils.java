import java.util.ArrayList;
import java.util.List;

public final class MathUtils {
    public static int lowestPositiveValue(List<Integer> list) {
        Integer lowest = Integer.MAX_VALUE;

        for (Integer number : list) {
            if (number >= 0 && number < lowest) {
                lowest = number;
            }
        }

        return lowest;
    }

    public static int numberSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            do {
                int digit = number % 10;
                number = number / 10;
                sum += digit;
            } while (number > 0);
        }
        return sum;
    }

    public static List<Integer> allNegative(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if (value < 0) {
                result.add(value);
            }
        }

        return result;
    }

}
