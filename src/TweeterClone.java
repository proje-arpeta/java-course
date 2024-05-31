import java.util.Arrays;
import java.util.Scanner;

public class TweeterClone {

    public boolean searchInArray(String[] list, String searchText){
        Arrays.sort(list);
        int indexOfUser = Arrays.binarySearch(list,searchText);
        boolean isUserFound =  indexOfUser >=0 ;
        return  isUserFound;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TweeterClone project = new TweeterClone();
        String[] users = {"iremarslan-1234","denizsakar-374637467364","cenk-skjdksjd","derya-123231231"};
        System.out.println("1=> Giriş Yap");
        System.out.println("2=> Kayıt ol");
        int operation = scanner.nextInt();
        scanner.nextLine();

        if (operation == 1){
            System.out.println("Kullancı adı giriniz");
           String userName = scanner.nextLine();
            System.out.println("Şifre Girniz");
            String password = scanner.nextLine();
            String searchParams = userName + '-' + password;
            boolean isUserFound =  project.searchInArray(users,searchParams );

            if (isUserFound){
                System.out.println("Hoşgeldiniz");
            }else{
                System.out.println("Kullanıcı adı veya şifre yanlış");
            }

        } else if (operation == 2) {
            System.out.println("Kullancı adı giriniz");
            String userName = scanner.nextLine();
            System.out.println("Şifre  giriniz");
            String password = scanner.nextLine();
            System.out.println("Şifre Tekrarı");
            String cPassword = scanner.nextLine();
            boolean isPasswordCorrect = password.equals(cPassword);
            String searchParams = userName + '-' + password; // aslı-1234;
            boolean isUserMatch = project.searchInArray(users,searchParams);

            if (isUserMatch){
                System.out.println("Kullancı adı alınmış");
            }
            if (isPasswordCorrect && !isUserMatch ){
                System.out.println("Başarılı");
            }else{
                System.out.println("Şifreler uyuşmuyor");
            }
        }else{
            System.out.println("Yanlış");
        }
    }
}
