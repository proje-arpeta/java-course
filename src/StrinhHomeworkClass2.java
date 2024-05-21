import java.util.Scanner;

public class StrinhHomeworkClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adı giriniz");
        String userName = scanner.nextLine();
        System.out.println("Şifre giriniz");
        String password = scanner.nextLine();
        System.out.println("Şifre Tekrar");
        String confirmPassword = scanner.nextLine();
        System.out.println("Email");
        String email = scanner.nextLine();
        int userNameLenth = userName.length();
        if (userNameLenth < 8){
            System.out.println("Kullanıcı adı 8 karakterden küçük olamaz");
        }

        boolean isPasswordMatch = password.equals(confirmPassword);

        if (!isPasswordMatch){
            System.out.println("Şifreler Uyuşmuyor");
        }


        boolean isEmail = email.contains("@");
        if (!isEmail){
            System.out.println("Geçerli bir eposta giriniz");
        }

        char firstChar = userName.charAt(0);
        if (firstChar == '1'){
            System.out.println("Kullancı adı standartlara uygun değil");
        }else{
            System.out.println("Kullanıcı adı:" + userName);
        }
         ///     true        &&  false      // tue              true
        if ( userNameLenth > 8 || isEmail  && firstChar == '1' && isPasswordMatch ){
            System.out.println("Hoşgeldin");
            String name = userName.substring(userNameLenth - 3);
        }

    }
}
