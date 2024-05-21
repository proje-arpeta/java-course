import java.util.Scanner;

public class StringHomework1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in) ;
       System.out.println("Kullanıcı adını giriniz");
       String userName = scanner.nextLine();
       System.out.println("Şifre giriniz");
       String password = scanner.nextLine();
       System.out.println("Şifre tekrarı");
       String confirmPassword = scanner.nextLine();
       System.out.println("E-posta adresini");
       String email = scanner.nextLine();

       int userNameLength = userName.length();
       if(userNameLength < 8) {
           System.out.println("Kullanıcı adı 8 karakterden küçük olamaz");
       }
       if (password.equals(confirmPassword)){
           System.out.println("Şifreler uyuşuyor");
       }else{
           System.out.println("Şifreler uyuşmuyor!Tekrar giriniz");
       }

       boolean isEmail = email.contains("@");
       if (!isEmail){
           System.out.println("Geçerli bir eposta adresini giriniz");
       }

        if (userName.charAt(0) == '1') {
            System.out.println("Kullanıcı adı standartlara uygun değil");
        }

        String last3digits = userName.substring(userNameLength - 3);
        System.out.println("Son 3 hane" +  last3digits);
       if (password.equals(confirmPassword) && isEmail && userNameLength > 8 ){
           System.out.println("Hoşgeldiniz");
       }
    }
}
