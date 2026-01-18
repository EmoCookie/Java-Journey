import java.util.Scanner;
import java.util.Random;

public class RPSGame {
    public static void main(String[] args) {

        // declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            // getting choice from user
            System.out.print("Enter your move (rock/paper/scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice!");
                continue;
            }

            // getting random choice from computer
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // check win conditions
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                    || playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");

            } else {

                System.out.println("You lose!");
            }

            // ask to play again
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        // goodbye message
        System.out.println("Goodbye!");

        scanner.close();
    }
}
