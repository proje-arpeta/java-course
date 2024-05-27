import java.util.Random;
import java.util.Scanner;

public class DiceRollSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Kaç kez zar atmak istersiniz? ");
        int rolls = scanner.nextInt();

        for (int i = 0; i < rolls; i++) {
            int result = random.nextInt(6) + 1;
            System.out.println("Zar sonucu: " + result);
        }
    }
}
