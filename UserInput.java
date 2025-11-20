import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA? ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Student: " + isStudent);

        // Sample code for solving issue when unable to take in the next input
        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
        // scanner.nextLine();

        // System.out.print("Enter your favourite colour: ");
        // String colour = scanner.nextLine();

        // System.out.println("You are " + age);
        // System.out.println("You like the colour " + colour);

        scanner.close();
    }
}
