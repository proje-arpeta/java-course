import java.util.Random;
import java.util.Scanner;

public class GuessTheGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Rastgele bir sayı:");

        int random_num = random.nextInt(100 ) +1;
        int userguess = scanner.nextInt();


        if (random_num==userguess){
            System.out.println("Başarılı");
        }
    }
}
