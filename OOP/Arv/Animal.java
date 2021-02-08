public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract boolean canFly();
    public abstract boolean canSwim();
    public abstract String sound();

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
