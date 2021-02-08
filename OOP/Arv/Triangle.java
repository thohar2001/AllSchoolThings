public class Triangle extends Shape {
    private int height;
    private int width;

    public Triangle(int height, int width) {
        super("Triangle");
        this.height = height;
        this.width = width;
    }

    public String toString() {
        return String.format("%s with a height: %d width: %d", super.toString(), height, width);
    }

}
