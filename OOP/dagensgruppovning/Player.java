public class Player {
    private String name;
    private int highscore;

    public Player(String name) {
        this.name = name;
    }

    public int score(int diceThrow) {
        if (diceThrow >= 8 && diceThrow < 12) {
            highscore = highscore + 1;
        } else if (diceThrow == 12) {
            highscore = highscore + 2;
        }

        return highscore;
    }

    public String getName() {
        return name;
    }

    public int getHighscore() {
        return highscore;
    }

}