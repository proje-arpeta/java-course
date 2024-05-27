import java.util.Scanner;

public class SwitchCaseExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gün adı giriniz");
        String dayName = scanner.nextLine();
        System.out.println("Gün numerası giriniz");
        int dayNumber = scanner.nextInt();

        switch (dayName){
            case "Pazartesi":
                System.out.println("1");
                break;
            case "Sali":
                System.out.println("2");
                break;
            default:
                System.out.println("Geçersiz gün");
                break;

        }


    }
}
