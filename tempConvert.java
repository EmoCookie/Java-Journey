import java.util.Scanner;

public class tempConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        String option;
        double newTemp;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        option = scanner.nextLine().toLowerCase();

        if (option.equals("f")) {
            newTemp = (temp * 9 / 5) + 32;
            System.out.println(newTemp);

        } else if (option.equals("c")) {
            newTemp = (temp - 32) * 5 / 9;
            System.out.println(newTemp);

        } else {
            System.out.println("Incorrect input!");
        }

        scanner.close();
    }
}
