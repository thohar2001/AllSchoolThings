import java.util.ArrayList;
import java.util.List;

public class PairApp {

    public static boolean isOdd(List<?> list) {
        if (list.size() % 2 == 0) {
            return false;
        }
        return true;
    }

    public static boolean allUnique(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; i < list.size(); i++) {
                if (i == j) {
                    continue;
                }
                if (list.get(i).equals(list.get(j))) {
                    return false;
                }
            }
        }
        return true;
        
        }
    
    public static <T extends Comparable<T>> boolean allSame(T o, T o1, T o2) {
        if (o == null && o1 == null && o2 == null) {
            return true;
        }

        return o.compareTo(o1) == 0 && o1.compareTo(o2) == 0;
    }

    public static <T extends Comparable<T>> boolean sortedCorrectly(List<T> list) {
        if(list.size() <= 1) {
            return true;
        }

        for (int i = 0; i < list.size(); i++) {
            T current = list.get(i);
            T nextValue = list.get(i+1);

            if (current.compareTo(nextValue) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(2, 3);
        Pair<Integer> pair2 = new Pair<>(2, 3);
        Pair<String> pair3 = new Pair<>("Jonas", "Karlsson");

        pair.printStuff();
        pair3.printStuff();
        System.out.println("\n\n");

        System.out.println("pair and pair 2 equals?: " + pair.equals(pair2));
        System.out.println("pair 2 and pair 3 equals?: " + pair2.equals(pair3));
        System.out.println("pair 3 and pair 2 equals?: " + pair3.equals(pair2));

        List<String> names = new ArrayList<>();
        names.add("Kurt");
        names.add("Jukka");
        names.add("Karl");
        System.out.println(isOdd(names));

        names.remove("Karl");

        System.out.println(isOdd(names));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);

        System.out.println("\nAre numbers odd? " + isOdd(numbers));

        System.out.println("\n\nAllsame(): " + allSame(3, 3, 3));



    }
}
