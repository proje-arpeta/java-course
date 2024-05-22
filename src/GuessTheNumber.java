import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("1 ile 100 arasında bir sayı tahmin edin: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Daha yüksek bir sayı girin.");
            } else if (guess > numberToGuess) {
                System.out.println("Daha düşük bir sayı girin.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Doğru tahmin! " + numberOfTries + " denemede buldunuz.");
            }
        }
        scanner.close();
    }
}
