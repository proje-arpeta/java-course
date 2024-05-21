import java.util.Scanner;

public class StringEmptyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email giriniz");
        String email = scanner.nextLine();
        boolean isEmailEmpty =  email.isEmpty();
        System.out.println("Email boş mu?" + isEmailEmpty );
        if (isEmailEmpty){
            System.out.println("Email giriniz");
        }


    }
}
