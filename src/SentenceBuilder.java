import java.util.Scanner;

public class SentenceBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Cümle oluşturmak için kelimeler girin (çıkmak için 'exit' yazın):");

        while (true) {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            sb.append(word).append(" ");
        }

        System.out.println("Oluşturulan cümle: " + sb.toString().trim());
        scanner.close();
    }
}