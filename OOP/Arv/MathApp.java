import java.util.List;

public class MathApp {
    public static void main(String[] args) {

        System.out.println(MathUtils.numberSum(List.of(122, 123, 999, 135))); 
        for (Integer value : MathUtils.allNegative(List.of(-22, 233, 99, -500, -22, 34))) {
            System.out.println(value);
        }

        System.out.println(MathUtils.lowestPositiveValue(List.of(-22, 233, 99, -500, -22, 34)));
        }
    }

