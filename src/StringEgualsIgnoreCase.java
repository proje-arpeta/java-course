import java.util.Scanner;

public class StringEgualsIgnoreCase {
    public static void main(String[] args) {
        String userName = "irem";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullancı adı: ");
        String userName2 = scanner.nextLine();
        System.out.println("Şifre : ");
        String password2 = scanner.nextLine();

        boolean isUsernameMatch = userName.equalsIgnoreCase(userName2);
        boolean isPasswordMatch = password.equalsIgnoreCase(password2);

        if (isUsernameMatch && isPasswordMatch){
            System.out.println("Hoşgeldin");
        }else{
            System.out.println("Girdiniz değerleri kontrol edin");
        }

    }
}
