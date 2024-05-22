import java.util.Random;
import java.util.Scanner;

public class RandomSentenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};

        System.out.print("Cümlenin uzunluğunu girin: ");
        int length = scanner.nextInt();

        if (length < 1) {
            System.out.println("Cümle uzunluğu en az 1 olmalıdır.");
            return;
        }

        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sentence.append(" ");
            }
            sentence.append(words[random.nextInt(words.length)]);
        }

        System.out.println("Oluşturulan cümle: " + sentence.toString());



    }
}
