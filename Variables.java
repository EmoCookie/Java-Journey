public class Variables {
    public static void main(String[] args) {
        int age = 21;
        int year = 2025;

        double price = 34.4;
        double gpa = 4.0;

        char grade = 'A';
        char symbol = '!';

        boolean isStudent = true;
        boolean forSale = false;

        String name = "Barney";

        System.out.println(age);
        System.out.println("The year is " + year);

        System.out.println("$" + price);
        System.out.println(gpa);

        System.out.println("Your grade is: " + grade);
        System.out.println(symbol);

        System.out.println(isStudent);
        System.out.println(forSale);

        System.out.println("Your name is " + name);

        // Using an if statement
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }
    }
}
