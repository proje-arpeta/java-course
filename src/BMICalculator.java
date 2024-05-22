import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden girin (örnek: 1.75): ");
        double height = scanner.nextDouble();

        System.out.print("Kilonuzu kilogram cinsinden girin: ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);
        String category;

        if (bmi < 18.5) {
            category = "Zayıf";
        } else if (bmi < 24.9) {
            category = "Normal";
        } else if (bmi < 29.9) {
            category = "Fazla kilolu";
        } else {
            category = "Obez";
        }

        System.out.printf("BMI: %.2f, Durum: %s%n", bmi, category);

        scanner.close();
    }
}
