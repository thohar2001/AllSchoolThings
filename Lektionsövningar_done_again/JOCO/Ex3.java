import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Roger", "Svantesson", 1964));
        people.add(new Person("Kalle", "Slaktarbarn", 1999));
        people.add(new Person("Gunhild", "Pettersson", 1940));
        people.add(new Person("Gunhild", "Pettersson", 1939));
        people.add(new Person("Sune", "Krattesson", 1964));
        people.add(new Person("Lotta", "Andersson", 1964));

        Collections.sort(people);

        for(Person person : people) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " född " + person.getYearOfBirth());
        }

        System.out.println("BirtYearComparator ---------------------\n");

        Comparator<Person> birthYearComparator = Comparator.comparing(Person::getYearOfBirth);

        Collections.sort(people, birthYearComparator);

        for(Person person : people) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " född " + person.getYearOfBirth());
        }
        
        Person adam = new Person("Adam", "Karlsson", 1990);
        Person adam2 = new Person(adam);

        System.out.println(adam.equals(adam2));
        System.out.println(adam == adam2);
        
    }
}