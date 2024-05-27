import java.util.Scanner;

public class CalculartorSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operatör giriniz(+,-,/");
        String operator = scanner.nextLine();
        System.out.println("1.sayı");
        int number1 = scanner.nextInt();
        System.out.println("2.sayı");
        int number2 = scanner.nextInt();
        int result = 0;
        switch (operator){
            case "+":
                result = number1 + number2;
                break;
            case  "-":
                result = number1 - number2;
                break;
            case  "/":
                result = number1 / number2;
                break;
            default:
                break;
        }

        System.out.println("Sonuç: " + result);
    }
}
