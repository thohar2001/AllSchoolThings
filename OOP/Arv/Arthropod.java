import java.util.Arrays;

public class Arthropod extends Animal {
    private final String[] lifeStages;
    private boolean canFly;
    private boolean canSwim;
    private String sound;

    public Arthropod(String name, String[] lifeStages, boolean canFly, boolean canSwim, String sound) {
        super(name);
        this.lifeStages = Arrays.copyOf(lifeStages, lifeStages.length);
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

    public String[] getLifeStages() {
        return lifeStages;
    }

    public String toString() {
        return super.getName() + " stages: " + Arrays.toString(lifeStages);
    }
}
