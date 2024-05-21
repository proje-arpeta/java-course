import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String sentence = scanner.nextLine();

        System.out.print("Değiştirmek istediğiniz kelimeyi girin: ");
        String oldWord = scanner.nextLine();

        System.out.print("Yeni kelimeyi girin: ");
        String newWord = scanner.nextLine();

        StringBuilder sb = new StringBuilder(sentence);
        int startIndex = sb.indexOf(oldWord);

        if (startIndex != -1) {
            sb.replace(startIndex, startIndex + oldWord.length(), newWord);
            System.out.println("Yeni cümle: " + sb.toString());
        } else {
            System.out.println("Kelime bulunamadı.");
        }

        scanner.close();
    }
}
