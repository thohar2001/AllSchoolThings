import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Roger", "Svantesson", 1964));
        people.add(new Person("Kalle", "Slaktarbarn", 1999));
        people.add(new Person("Gunhild", "Pettersson", 1939));
        people.add(new Person("Sune", "Krattesson", 1964));
        people.add(new Person("Lotta", "Andersson", 1964));

        Collections.sort(people);

        for(Person person : people) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        System.out.println("BirtYearComparator ---------------------\n");

        Collections.sort(people, new BirthYearComparator());

        for(Person person : people) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " född " + person.getYearOfBirth());
        }
        
    }
}