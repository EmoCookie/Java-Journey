public class NestedLoop {
    public static void main(String[] args) {

        for (int count = 0; count < 3; count++) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
}
