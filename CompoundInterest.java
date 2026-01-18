import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int years;
        int timesCompound;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * years);

        System.out.println("The amount after " + years + " is $" + amount);

        scanner.close();
    }
}
