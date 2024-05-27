import java.util.Scanner;

public class SumOfArrayExample {
    public static void main(String[] args) {
     String[] names ;
     int[] numbers ;
     double[] prices;

     int x = 0;
     x  = 10;
     numbers  = new int[5]; //{0,0,0,0,0};
        System.out.println(numbers[2]);
        numbers[1] = 10; //{0,10,0,0,0};
        numbers[0] = 5; //{5,10,0,0,0};
        numbers[3] = 17;//{5,10,0,17,0};
        numbers[4] = 23;//{5,10,0,17,23};
        numbers[2] = 8;//{5,10,8,17,23};


        System.out.println("Sınıf kaç kişilik");
        Scanner scanner = new Scanner(System.in);
        int studentCount = scanner.nextInt();
        int[] grades = new int[studentCount]; // {0,0,0}
        int total = 0;
        for (int i = 0; i <studentCount ; i++) {
            System.out.println("Notu giriniz");
            int grade = scanner.nextInt();
            grades[i] = grade;
            total = total + grade;
        }
        total = total / studentCount;
        System.out.println("Sınıf ortlaması : " + total);
        System.out.println("Adınız");
        scanner.nextLine();
        String name  = scanner.nextLine();

        // 1 =>
        // Takipçi Sayınız: 10
        // İrem
        //Büşra
        //....

        // 2=>
        //takip Sayınız: 30
        // İrem
        //Büşra
       // ....

        // 3
       // aramak istediğiniz ismi girinz
        // irem
       // {"irem","büşra","cansel","dilara"}


    }


}
