import java.util.Scanner;

public class Banking {
    static int balance = 20000;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");

        menu();

        System.out.print("Enter your choice (1-4): ");
        int option = scanner.nextInt();

        processMenu(option);
        scanner.close();
    }

    static void menu() {
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");
    }

    static void processMenu(int option) {

        switch (option) {
            case 1 -> showbalance();
            case 2 -> deposit(balance);
            case 3 -> withdraw(balance);
            case 4 -> System.out.println("Exiting program..");
            default -> System.out.println("Invalid choice!");
        }
    }

    static void showbalance() {
        System.out.println("Current balance " + balance);
    }

    static int deposit(int balance) {

        System.out.print("Enter the amount you want to deposit: ");
        int depositMoney = scanner.nextInt();

        int updated = balance + depositMoney;
        System.out.println("Deposit successful!");
        System.out.println("New balance: " + updated);

        return updated;
    }

    static int withdraw(int balance) {

        System.out.print("Enter the amount you want to withdraw: ");
        int withdrawMoney = scanner.nextInt();
        int updated1 = balance - withdrawMoney;
        System.out.println("Withdrawn successfully!");
        System.out.println("New balance: " + updated1);

        return updated1;

    }

}
