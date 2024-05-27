import java.util.Scanner;

public class IfElseExamples2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        if ( age < 30 ){

        }else if ( age < 40){
            System.out.println("Daha Genç");
        }else if (age > 50 && age < 70){
            System.out.println("Çok Daha Genç");
        }else {

        }
        double x = 60 / (160 * 160) ;
        System.out.println( x);


    }
}
