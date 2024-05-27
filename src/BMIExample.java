import java.util.Scanner;

public class BMIExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilo  giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("Boy giriniz");
        double boy = scanner.nextDouble();
        double bmi = kilo / (boy * boy) * 10000;
        System.out.println("BMI " + bmi);

    }
}
