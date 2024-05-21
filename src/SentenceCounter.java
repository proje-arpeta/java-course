import java.util.Scanner;
import java.util.StringTokenizer;

public class SentenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin (cümleleri noktalarla ayırın): ");
        String text = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(text, ".");
        int sentenceCount = 0;

        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();
            sentenceCount++;
        }

        System.out.println("Cümle sayısı: " + sentenceCount);
        scanner.close();
    }
}
