import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Arthropod("Fly", "egg", "larvae", "cocoon", "imago"));
        animals.add(new Arthropod("Bee", "egg", "larvae", "cocoon", "imago"));
        animals.add(new Chordate("Tiger", 40));
        animals.add(new Chordate("Fish", 20));

        for(Animal djur : animals) {
            System.out.println(djur.getName());
        }
    }
}
