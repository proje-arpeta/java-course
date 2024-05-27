import java.util.Scanner;

public class WeeklyExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] expenses = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Gün " + (i + 1) + " harcaması: ");
            expenses[i] = scanner.nextDouble();
        }

        double total = 0;
        for (double expense : expenses) {
            total += expense;
        }

        System.out.println("Toplam haftalık harcama: " + total);
    }
}
