import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Arthropod("bee", new String[] {"egg", "larvae", "pupa", "imago"}, true, false, "bzzzz"));
        animals.add(new Arthropod("krill", new String[] {"egg", "nauplius", "adult"}, false, true, "blubb"));
        animals.add(new Chordate("human", 0, false, true, "aaaaaahhhhhhhhhhhhhhhh"));
        animals.add(new Chordate("oikopleura dioica", 4, true, false, ""));

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println("Can fly: " + animal.canFly());
            System.out.println("Can swim: " + animal.canSwim());
            System.out.println(animal.getName() + " goes: " + animal.sound());
            System.out.println("\n");
        }
    }
}
