import java.util.Random;

public class GameEngine {

    public static int throwDice() {
        Random rand = new Random();
        int random = rand.nextInt(12) + 1;
        return random;
    }
}
