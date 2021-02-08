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

    public Person(Person person) {
        this.firstName = person.firstName;
        this.lastName = person.lastName;
        this.yearOfBirth = person.yearOfBirth;
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

    public int compareTo(Person person) {
        return lastName.compareTo(person.lastName);
    }

    public String toString() {
        return firstName + " " + lastName + ". Born: " + yearOfBirth;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        result = prime * result + (firstName != null ? firstName.hashCode() : 0);
        result = prime * result + (lastName != null ? lastName.hashCode() : 0);
        result = prime * result + yearOfBirth;
        return result;
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

        return Objects.equals(this.firstName, person.firstName) 
                             && Objects.equals(this.lastName, person.lastName)
                             && Objects.equals(this.yearOfBirth, person.yearOfBirth);
    }

}
