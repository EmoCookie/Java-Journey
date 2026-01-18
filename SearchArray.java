import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // int[] numbers = { 4, 6, 3, 100, 9, 44, 12 };
        String[] fruits = { "mango", "grapes", "watermelon" };
        boolean isFound = false;
        String target1;
        // int target = 2;

        System.out.print("Enter a fruit to search for: ");
        target1 = scanner.nextLine();

        // for (int i = 0; i < numbers.length; i++) {
        // if (target == numbers[i]) {
        // System.out.println("Element found at index: " + i);
        // isFound = true;
        // break;
        // }
        // }

        // if (!isFound) {
        // System.out.println("Element not found!");
        // }

        for (int i = 0; i < fruits.length; i++) {
            if (target1.equals(target1)) {
                System.out.println("Element found!");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found!");
        }

        scanner.close();
    }
}
