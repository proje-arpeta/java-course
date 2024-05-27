import java.util.Scanner;

public class ArrayExamples002 {
    public static void main(String[] args) {
        int[] numbers ;
        int[] numbers2 = {0,2,6,1,1,234,2934,2};
        numbers = new int[5]; // {0,0,0,0,0}
        System.out.println(numbers[0]);
        numbers[1] = 13; // {0,13,0,0,0}
        numbers[3] = 17; // {0,13,0,17,0}
        numbers[2] = 34; // {0,13,34,17,0}
        numbers[4] = 43; // {0,13,34,17,43}
        numbers[0] = 3; // {3,13,34,17,43}
        numbers[3] = 29; // {3,13,34,29,43}
        numbers[2] = numbers[2]  + 100 ; // {3,13,134,29,43}
        Scanner scanner = new Scanner(System.in);
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();

        System.out.println("Kaç kişi?");
        int studentCount = scanner.nextInt(); // 3
        int[] grades = new int[studentCount]; // {0,0,0}
        for (int i = 0; i < studentCount; i++) {
            System.out.println("not: ");
            int grade = scanner.nextInt();
            System.out.println("Kİsim?");
            scanner.nextLine();
            String name = scanner.nextLine();
            grades[i] = grade ; // 10,30,50}
        }

        for (int i = 0; i < grades.length ; i++) {
            System.out.println(grades[i]);

        }

    }
}
