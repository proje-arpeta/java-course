import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("E-posta adresinizi girin: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Geçerli e-posta");
        } else {
            System.out.println("Geçersiz e-posta");
        }
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
