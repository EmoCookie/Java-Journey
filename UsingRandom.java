import java.util.Random;

public class UsingRandom {
    public static void main(String[] args) {
        Random random = new Random();

        boolean isHeads;

        isHeads = random.nextBoolean();

        System.out.println(isHeads);

        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

    }
}
