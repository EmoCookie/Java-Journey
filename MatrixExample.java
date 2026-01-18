import java.util.Scanner;

public class MatrixExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.nextLine();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }

        scanner.close();
    }
}
