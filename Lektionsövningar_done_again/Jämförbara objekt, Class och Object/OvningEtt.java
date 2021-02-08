import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OvningEtt {
    public static void main(String[] args) {
        Person p1 = new Person("Johan", "Karlsson", 1990);
        Person p2 = new Person("Kalle", "Olofsson", 2000);
        Person p3 = new Person("Mac", "Donald", 1954);
        Person p4 = new Person("Olov", "MacFlurry", 1999);
        Person p5 = new Person("Karl", "Zandreasson", 2001);

        List<Person> people = new ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        for(Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people);
        System.out.println("\n \nPeople are now sorted on last names. \n \n");

        for(Person person : people) {
            System.out.println(person);
        }

        
    }
}