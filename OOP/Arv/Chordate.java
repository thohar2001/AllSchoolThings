public class Chordate extends Animal {
    public double tailLength;
    public boolean canFly;
    public boolean canSwim;
    public String sound;

    public Chordate(String name, double tailLength, boolean canFly, boolean canSwim, String sound) {
        super(name);
        this.tailLength = tailLength;
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.sound = sound;
    }

    public boolean canFly() {
        return canFly;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String sound() {
        return sound;
    }

    public double getTailLength() {
        return this.tailLength;
    }

    public String toString() {
        return super.getName() + " tail length: " + tailLength;
    }
}
