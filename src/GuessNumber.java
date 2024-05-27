import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = scanner.nextInt();
            if (x > 10){
                System.out.println("10 dan büyük");
                break;
            }
        }
    }
}
