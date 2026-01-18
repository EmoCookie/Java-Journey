import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        double weight;
        int option;

        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            weight = weight * 0.453;

            System.out.printf("The new weight in lbs is: %.2f", weight);

        } else if (option == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            weight = weight * 2.20;

            System.out.printf("The new weight in kgs is: %.2f", weight);
        } else {
            System.out.println("Incorrect input!");
        }

        scanner.close();
    }
}
