import java.util.Scanner;

public class BreakContinueExmp2 {
    public static void main(String[] args) {
        int operation = 0;

        Scanner scanner = new Scanner(System.in);
        String cUserName = "irem";
        String cPassword = "irem";
        for (int i = 0; i < 10; i++) {
            if (i> 3 && i < 6){
                continue;
            }
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);
            System.out.println("i " + i);

        }
        while (true){
            System.out.println("Kullanıcı adı");
            String userName = scanner.nextLine();
            System.out.println("Şifre");
            String password = scanner.nextLine();

            boolean isUserCorrect = userName.equals(cUserName) && password.equals(cPassword);

            if(!isUserCorrect){
                continue;
            }

                System.out.println("Holşgeldin");
                System.out.println("Pofil bilgilerinizi giriniz");
                System.out.println("Yaşınızı giriniz");
                int age = scanner.nextInt();
                 scanner.nextLine();
            System.out.println("Adınızı giriniz");
            String name = scanner.nextLine();
                break;


        }


    }
}
