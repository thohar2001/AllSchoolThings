import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int yearOfBirth;

    public Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public Person(Person o) {
        this.firstName = o.firstName;
        this.lastName = o.lastName;
        this.yearOfBirth = o.yearOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public int compareTo(Person o) {
        Comparator<Person> comp = Comparator.comparing(Person::getFirstName)
                                            .thenComparing(Person::getLastName)
                                            .thenComparing(Person::getYearOfBirth);
        
        return comp.compare(this, o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        } 

        Person person = (Person) o;

        return Objects.equals(this.getFirstName(), person.getFirstName()) &&
               Objects.equals(this.getLastName(), person.getLastName()) &&
               Objects.equals(this.getYearOfBirth(), person.getYearOfBirth());
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        result = result * prime + ((this.getFirstName() == null) ? 0 : this.getFirstName().hashCode());
        result = result * prime + this.getLastName().hashCode();
        result = result * prime + this.getYearOfBirth();

        return result;
    }

    
}
