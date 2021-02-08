import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter player 1 name: ");
        String nameP1 = scan.nextLine();

        System.out.println("Enter player 2 name: ");
        String nameP2 = scan.nextLine();
        System.out.println("");

        Player player1 = new Player(nameP1);
        Player player2 = new Player(nameP2);

        int choice1;
        int choice2;
        int roundsPlayed = 0;

        /**
         * We chose to have rounds played outside of the Player class. Since both
         * players have the same amount of rounds.
         */
        do {
            System.out.println(player1.getName() + " | press 1 to roll dice or 0 to surrender");
            choice1 = scan.nextInt();
            if (choice1 == 0) {
                System.out.println(player1.getName() + " loses");
                roundsPlayed++;
                break;
            }

            int diceThrow1 = GameEngine.throwDice();
            System.out.println(player1.getName() + " throws a " + diceThrow1 + "\n");
            player1.score(diceThrow1);

            System.out.println(player2.getName() + " | press 1 to roll dice or 0 to surrender");
            choice2 = scan.nextInt();
            if (choice2 == 0) {
                System.out.println(player2.getName() + " loses");
                roundsPlayed++;
                break;
            }

            int diceThrow2 = GameEngine.throwDice();
            System.out.println(player2.getName() + " throws a " + diceThrow2 + "\n");

            player2.score(diceThrow2);

            System.out.println(player1.getName() + " has " + player1.getHighscore() + " points");
            System.out.println(player2.getName() + " has " + player2.getHighscore() + " points" + "\n");

            roundsPlayed++;
            System.out.println("rounds played: " + roundsPlayed);

        } while (roundsPlayed != 6);

        if (player1.getHighscore() > player2.getHighscore()) {
            System.out.println(player1.getName() + " wins!");
            System.out.println(player1.getName() + ": " + player1.getHighscore() + " points.");
            System.out.println(player2.getName() + ": " + player2.getHighscore() + " points.");
        } else if (player1.getHighscore() == player2.getHighscore()) {
            System.out.println("It's a draw. Both players had " + player1.getHighscore() + " points.");
        } else {
            System.out.println(player2.getName() + " wins!");
            System.out.println(player2.getName() + ": " + player2.getHighscore() + " points.");
            System.out.println(player1.getName() + ": " + player1.getHighscore() + " points.");
        }
    scan.close();
    }

}
