import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        int quantity;
        double price;
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price for one? ");
        price = scanner.nextDouble();

        System.out.print("How many " + item + " would you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("You have bought " + quantity + " " + item + "(s)");
        System.out.println("Your total is $" + total);

        scanner.close();
    }
}