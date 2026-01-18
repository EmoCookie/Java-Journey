import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 1;
        int randomNumber = random.nextInt(1, 100);

        System.out.println("Number Guessing Game");
        System.out.print("Guess a number between 1 - 100: ");
        guess = scanner.nextInt();

        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }

            attempts += 1;
            System.out.print("Guess a number between 1 - 100: ");
            guess = scanner.nextInt();

        }

        System.out.println("You have guessed it correctly!");
        System.out.println("Total attempts: " + attempts);
        scanner.close();
    }
}
