
public class OvningSex {
    public static void main(String[] args) {
        // Add copy constructor to Person

        Person ove = new Person("Ove", "Sundberg", 1983);

        Person ove2 = new Person(ove);

        System.out.println("Ove equals ove2? " + ove.equals(ove2));

        System.out.println("Ove identical ove2? " + (ove == ove2));
    }

}
