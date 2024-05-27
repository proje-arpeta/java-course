import java.util.Scanner;

public class SwitchCaseExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gün giriniz");
        int dayNumber = scanner.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarş");
                break;
            case 4:
                System.out.println("Perşembbe");
                break;
            default:
                System.out.println("Yanlış gün");
                break;
        }
    }

}
