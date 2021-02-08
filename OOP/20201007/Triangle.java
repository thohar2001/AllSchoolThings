public class Triangle extends Shape {
    private int height;
    private int width;

    public Triangle(int height, int width) {
        super("Triangle");
        this.height = height;
        this.width = width;
    }
    
    public String toString() {
        String facts = String.format("%d in height, %d in width and it's name is %s", height, width, super.toString());
        return facts;
    }
}
