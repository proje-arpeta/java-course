import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String input = scanner.nextLine();
        int vowelCount = 0;

        for (char ch : input.toCharArray()) {
            if (isVowel(ch)) {
                vowelCount++;
            }
        }

        System.out.println("Sesli harf sayısı: " + vowelCount);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
