import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Parolanızı girin: ");
        String password = scanner.nextLine();

        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        boolean isStrongPassword = password.matches(passwordPattern);
        System.out.println("Güçlü parola mı? " + isStrongPassword);
    }
}
