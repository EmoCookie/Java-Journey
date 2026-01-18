import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double result = 0;
        String operator;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.nextLine();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    result = num1 / num2;
                }
            }
            case "^" -> result = Math.pow(num1, num2);
            default -> System.out.println("Invalid entry!");
        }

        System.out.println(result);

        scanner.close();
    }
}
