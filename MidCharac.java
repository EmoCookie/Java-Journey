import java.util.Scanner;

public class MidCharac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any word: ");
        String value = scanner.nextLine();

        System.out.println(findMid(value));
        scanner.close();
    }

    static String findMid(String value) {

        int length = value.length();

        if (length % 2 == 0) {
            int start = length / 2;
            value = value.substring(start - 1, start + 1);
            return value;
        } else {
            int start1 = length / 2;
            value = value.substring(start1, start1 + 1);
            return value;
        }

    }
}
