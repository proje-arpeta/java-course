import java.util.Scanner;

public class Ternaryexp {
    public static void main(String[] args) {
        int age = 30;
        String text = "irem";
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String message = (age < 30) ? "Uygun" : "Uygun değil";
        boolean isThatMatch = (text.length() > 8) ? true : false;
        boolean isUserAuth = (userName == "admin") ? true: false;
        boolean isThatCorrect = false;
        int x = 10 + 40 / 100;
        int number;
        if (age < 30){
            System.out.println("Koşul uygun değil");
            number= 10;
        }else{
            System.out.println("Koşul uygun");
            number= 150;

        }
    }
}
