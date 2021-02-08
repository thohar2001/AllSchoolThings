import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Pair<T extends Comparable<T>> implements Comparable<Pair<T>> {
    T value1;
    T value2;
    
    public Pair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void printStuff() {
        System.out.println(value1.getClass().getName());
        System.out.println(value2.getClass().getName());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value1 == null) ? 0 : value1.hashCode());
        result = prime * result + ((value2 == null) ? 0 : value2.hashCode());
        return result; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair<?> pair = (Pair<?>) obj;

        return Objects.equals(this.value1, pair.value1) &&
               Objects.equals(this.value2, pair.value2);
    }

    @Override
    public int compareTo(Pair<T> obj) {
        Comparator<T> comp = Comparator.naturalOrder();
        var res = comp.compare(this.value1, obj.value1);
       
        if(res != 0) {
            return res;
        }

        return comp.compare(this.value2, obj.value2);
    }


}
