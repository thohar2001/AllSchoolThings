import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(10));
        shapes.add(new Circle(20));
        shapes.add(new Triangle(10, 20));
        shapes.add(new Triangle(20, 40));

        for(Shape forms : shapes) {
            System.out.println(forms.toString()); 
        }

    }
}
