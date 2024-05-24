import java.util.Random;
import java.util.Scanner;

public class RandomGuesGame {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Bilienmesi gerejen sayı " + randomNumber);
        Scanner scanner = new Scanner(System.in);
        boolean isThatCorrect = false;
        while (!isThatCorrect){
            System.out.println("1 ile 100 arası bir sayı gir!");
            int userInput = scanner.nextInt();
            if (userInput == randomNumber) {
                System.out.println("Bravoo doğru bildin");
                isThatCorrect = true;
            }else if ( userInput < randomNumber){
                System.out.println("Yukarı");
            } else if (userInput > randomNumber) {
                System.out.println("Aşağı");
            }

            ///ABCDEabcd1##323456####78765434567876543$$$iremiremirem' 38
            // B7c8

        }

    }
}
