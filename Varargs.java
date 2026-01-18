public class Varargs {
    public static void main(String[] args) {

        // System.out.println(add(1, 2, 3, 4));

        // System.out.println(average());

    }

    static int add(int... numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    static double average(double... values) {

        double sum = 0;

        if (values.length == 0) {
            return 0;
        }

        for (double value : values) {
            sum += value;
        }

        return sum / values.length;
    }

}