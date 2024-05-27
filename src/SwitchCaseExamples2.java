import java.util.Scanner;

public class SwitchCaseExamples2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        switch (dayNumber){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case  3:
                System.out.println("çarşamba");
                break;
            case    4:
                System.out.println("Perşembe");
                break;
            default:
                break;
        }



    }
}
