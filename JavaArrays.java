import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {

        String[] fruits = { "apple", "orange", "banana", "coconut" };

        // int[] numbers = { 1, 100, 12, 43, 78, 33 };

        // fruits[0] = "pineapple";

        // for (int i = 0; i < fruits.length; i++) {
        // System.out.println(fruits[i]);
        // }

        // Arrays.sort(fruits);

        Arrays.fill(fruits, "cake");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Arrays.sort(numbers);

        // for (int number : numbers) {
        // System.out.println(number);
        // }

        // System.out.println(frchuits.length);
    }
}