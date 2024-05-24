import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String upper = "ABCDEFGHJIKLMNOPRSTYZ";
        String lower = "abcdefghijklmnoprstyuvyz";
        String numbers = "0123456789";
        String symbols = "@!.+#$?-_|&";
        String passwordRegex = upper +  lower + numbers + symbols;
        System.out.println(passwordRegex);
        int regexLength = passwordRegex.length();
        Random random = new Random();
        System.out.println("Kaç karakterlik şifre türetelim");
        int userRequestLenth = scanner.nextInt();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < userRequestLenth; i++) { // 0 1 2
            int randomCharIndex = random.nextInt(regexLength); // 13 3 56
            char randomChar = passwordRegex.charAt(randomCharIndex); // a C
           password.append(randomChar);
           //System.out.println("password string" + password);
        }

        System.out.println("Şifreniz oluşturuldu + " + password );


        //7 text = "fox irem atv kedi köpek merhaba xxx djfdjhfdjhfdj lskdslk";
        // kelimeler = [fox, irem, atv, kedi, köpe, merhaba, xxx, dfjdhfjdhf, sjhdjshd];
        // text.chart(3)
        // kelimer[3]

    }
}
