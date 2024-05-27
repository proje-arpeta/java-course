import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci sayısını girin: ");
        int numberOfStudents = scanner.nextInt();
        int[] grades = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Öğrenci " + (i + 1) + " notunu girin: ");
            grades[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        double average = (double) sum / numberOfStudents;
        System.out.println("Notların ortalaması: " + average);
    }
}
