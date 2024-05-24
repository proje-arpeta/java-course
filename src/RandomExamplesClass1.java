import java.util.Random;
import java.util.Scanner;

public class RandomExamplesClass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(3) * 100;
        System.out.println(randomNumber);

          boolean radomBool = random.nextBoolean();
          System.out.println(radomBool);


        double randomMathDouble = Math.random();
        System.out.println(randomMathDouble * 100);
        int randomDoubleToInt = (int) (randomMathDouble * 1000) ;
        System.out.println(randomDoubleToInt);



    }
}
