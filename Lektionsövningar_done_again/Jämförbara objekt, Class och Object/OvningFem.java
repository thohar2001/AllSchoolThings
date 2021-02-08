public class OvningFem {
    public static void main(String[] args) {
        Person p1 = new Person("Ola", "Conny", 1990);
        Person p2 = new Person("Jesus", "Kristus", 1000);
        Person p3 = new Person("Morgan", "Karlsson", 1963);
        Person p4 = new Person("Ola", "Conny", 1990);

        System.out.println("Person p1 hashcode: " + p1.hashCode());
        System.out.println("Person p4 hashcode: " + p4.hashCode());

        System.out.println("\nJämför p1 och p4 med equals: " + p1.equals(p4));



    }
}
