import java.util.Random;

public class RandomExamplesClass2 {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
           // int randomInt = random.nextInt(10) * 10;
          //  System.out.println("randomInt " + randomInt);
           double randomDouble = random.nextDouble() * 10;
           // 5.222654376848691 / 10 0.52226543
           System.out.println(randomDouble) ;


        }
    }
}