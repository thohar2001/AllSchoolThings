import java.util.Comparator;

public class BirthYearComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getYearOfBirth(), p2.getYearOfBirth());
    }
    
}
