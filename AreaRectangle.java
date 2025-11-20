import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        // variables
        double width;
        double length;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        length = scanner.nextDouble();

        area = width * length;

        System.out.println("The area of the rectangle is " + area + "cm");

        scanner.close();
    }
}
