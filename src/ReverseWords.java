import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String sentence = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(sentence);
        StringBuilder reversedSentence = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse()).append(" ");
        }

        System.out.println("Ters çevrilmiş kelimeler: " + reversedSentence.toString().trim());
        scanner.close();
    }
}
