import java.util.Random;

public class RandomPswGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String pwdRegex = "lksjdflkjsdlkfjs01928347e367roıdsjfdslkhfglkfsşdfıhgflskdfh";
        String upperText = "ABCDEFGJKLNOPRSTYZX";
        String lowerText = "abcdefghijklmnoprstyxw";
        String numbers="0123456789";
        String symbols = "&%!._-|+^";
        String passwordRegex = numbers + upperText + lowerText + numbers + symbols;
        System.out.println("PasswordREgex " + passwordRegex);
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            int randomIndex = random.nextInt(passwordRegex.length());
            char randomChar = passwordRegex.charAt(randomIndex);
            System.out.println(randomChar);
            password.append(randomChar);
        }

        for (int i = 0; i <10; i++){
            System.out.println("jdhsfjkshf");
        };
        int x = 1073;
        int y = 20;
        System.out.println("Oluşturulan şifre " + password );
        // bir password stringi oluşturun içerisden karakterlerin seçilmesi için
        // Kullanıcıdan istediği şifrenin uzunluğunu alın integer olarak
        //İstediği karakter uzunluğu kadar döngüde dönerek
        // Random bir şifre oluşturun.
    }
}
