
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı girin: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Geçersiz yaş.");
        } else if (age < 13) {
            System.out.println("Çocuk.");
        } else if (age < 20) {
            System.out.println("Genç.");
        } else if (age < 65) {
            System.out.println("Yetişkin.");
        } else {
            System.out.println("Yaşlı.");
        }

        scanner.close();
    }
}
