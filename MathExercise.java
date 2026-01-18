import java.util.Scanner;

public class MathExercise {
    public static void main(String[] args) {

        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        // double result;

        // result = Math.pow(2, 5);
        // result = Math.abs(-5);
        // result = Math.sqrt(9);
        // result = Math.round(3.14);
        // result = Math.ceil(3.14);
        // result = Math.floor(3.99);
        // result = Math.max(10, 20);
        // result = Math.min(10, 20);

        // System.out.println(result);

        Scanner scanner = new Scanner(System.in);

        // double a;
        // double b;
        // double c;

        // System.out.print("Enter the value of a: ");
        // a = scanner.nextDouble();

        // System.out.print("Enter the value of b: ");
        // b = scanner.nextDouble();

        // c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // System.out.print("The answer is: " + c + "cm");

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumferenc: %.1f\n", circumference);
        System.out.printf("The area: %.1f\n", area);
        System.out.printf("The volume: %.1f\n", volume);

        scanner.close();
    }

}
