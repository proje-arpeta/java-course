import java.util.Scanner;

public class StringWhileTrueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;

        while (true){
            System.out.println("Kullanıcı adı giriniz");
            userName = scanner.nextLine();
          if (userName.length() > 8){
              System.out.println("Hoşgelsin");
            break;
          }else{
              System.out.println("Kullanıcı adı 8 karakterden küçü olamaz");
          }


        }
    }
}
