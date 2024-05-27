import java.util.Scanner;

public class ArrayExample01 {
    public static void main(String[] args) {
        System.out.println("Öğrengi sayınız");
        Scanner scanner = new Scanner(System.in);
        int studentCount = scanner.nextInt();
        int[] grades = new int[studentCount];

        for (int i = 0; i < studentCount ; i++) {
            System.out.println("indeks" + i);
            int grade = scanner.nextInt();
            grades[i] = grade;
        }
        int total = 0;
        for (int value: grades){
           total = total + value;
        }
        System.out.println("Toplam not ortalaması" + total / grades.length);
        int toplamWith10 = 0;
        for (int i = 0; i < grades.length; i++) {
           int value = grades[i];
           int newValue = value + 10;
            grades[i] = newValue;
            toplamWith10 = toplamWith10 +  grades[i];
        }

        System.out.println("10 puan eklenmiş not ortalaması" + toplamWith10 / grades.length);
    }
}
