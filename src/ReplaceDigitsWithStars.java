import java.util.Scanner;

public class ReplaceDigitsWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String text = scanner.nextLine();

        StringBuilder modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (Character.isDigit(modifiedText.charAt(i))) {
                modifiedText.setCharAt(i, '*');
            }
        }

        System.out.println("Değiştirilmiş metin: " + modifiedText.toString());
        scanner.close();
    }
}
