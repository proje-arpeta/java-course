import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi işlem + - *");
        String operation = scanner.nextLine();

        System.out.println("1.sayı");
        int number1 = scanner.nextInt();
        System.out.println("2.sayı");
        int number2 = scanner.nextInt();
        int result = 0;

        if (number1 == 0 || number2 == 0){
           System.out.println("Sıfır olamaz");
        }
        switch (operation){
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case  "/":
                result = number1 * number2;


                break;
            default:
                result = 0;
                break;
        }

        System.out.println("Sonuç: "+ result);
    }
}
