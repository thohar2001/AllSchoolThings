import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.5));
        shapes.add(new Circle(3.0));
        shapes.add(new Triangle(2, 5));
        shapes.add(new Triangle(4, 5));

        for (Shape theShape : shapes) {
            System.out.println(theShape);
        }
    }
}
