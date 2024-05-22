import java.util.Scanner;

public class StringEgualsIgnoreLoop {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "admin1234";

        Scanner scanner = new Scanner(System.in);
        String userName2;
        String password2;
        while (true){
            System.out.println("Kullanıcı adı giriniz");
            userName2 = scanner.nextLine();
            System.out.println("Şifre giriniz giriniz");
            password2 = scanner.nextLine();
            boolean isUserNameMatch = userName.equals(userName2);
            boolean isPasswordMatch = password.equals(password2);
            if (isUserNameMatch && isPasswordMatch){
                System.out.println("HOşgeldin");
                break;
            }else if (isUserNameMatch){
                System.out.println("Kullanıcı adı doğru");
            }else if (isPasswordMatch){
                System.out.println("Şifre Doğru");
            }else{
                System.out.println("Değerleri kontrol ediniz");
            }

        }

    }
}
