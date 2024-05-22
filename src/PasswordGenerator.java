import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String allChars = upper + lower + digits;

        System.out.print("Şifrenizin uzunluğunu girin: ");
        int length = scanner.nextInt();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        System.out.println("Rastgele şifreniz: " + password.toString());
        scanner.close();
    }
}
