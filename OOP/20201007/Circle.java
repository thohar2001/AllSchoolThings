public class Circle extends Shape {
    protected int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public String toString() {
        String facts = String.format("The radius is %d and it's name is %s", radius, super.toString());
        return facts;
    }


}
