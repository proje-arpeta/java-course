import java.util.Scanner;

public class BreakCountinueExamples {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
       String cUserName = "irem";
       String cPassword = "irem";
        while (true){
            System.out.println("Kullanıcı adı " );
            String userName = scaner.nextLine();
            System.out.println("Şifre " );
            String password = scaner.nextLine();
            boolean isCorrect = userName.equals(cUserName) && password.equals(cPassword);
            //boolean isCorrect2 = userName.equals(cUserName) || password.equals(cPassword); ikisinden birisi doğruysa
           if (isCorrect){
               System.out.println("Yaşınızı giriniz");
               int age = scaner.nextInt();
           }else{
               continue;
           }

        }


    }
}
