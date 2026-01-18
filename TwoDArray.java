public class TwoDArray {
    public static void main(String[] args) {

        // String[] fruits = { "banana", "pears", "mango" };
        // String[] vegetables = { "tomato", "onion", "carrot" };
        // String[] meats = { "chicken", "mutton", "beef", "fish" };

        String[][] groceries = { { "banana", "pears", "mango" },
                { "tomato", "onion", "carrot" },
                { "chicken", "mutton", "beef", "fish" } };

        groceries[0][0] = "pineapple";
        groceries[1][0] = "cabbage";
        groceries[1][2] = "dill";
        groceries[2][1] = "eggs";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }

            System.out.println();
        }
    }
}
