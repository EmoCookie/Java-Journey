import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        // questions array[]
        String[] questions = {
                "What is the abbreviation of central processing unit?",
                "What is 2 plus 3?",
                "What color is the sky?",
                "What was the first programming language?",
                "What year was Facebook launched?" };

        // options array[][]
        String[][] options = {
                { "1. CPU", "2. CAP", "3. LMN" },
                { "1. Six", "2. Five", "3. Seventy" },
                { "1. Yellow", "2. Pink", "3. Blue" },
                { "1. COBOL", "2. C", "3. Fortran" },
                { "1. 2000", "2. 2004", "3. 2006" }, };

        // declare variables
        int[] answers = { 1, 2, 3, 3, 2 };
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        // welcome message
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("--------------------------------");

        // question (loop)
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("------------------------");
                System.out.println("CORRECT!");
                System.out.println("------------------------");
                score++;
            } else {
                System.out.println("------------------------");
                System.out.println("WRONG!");
                System.out.println("------------------------");
            }
        }

        // display final score
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
