public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + " with a radius of " + radius;
    }
}
