import java.util.Comparator;

public class BirthYearComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth());
    }
    
}
