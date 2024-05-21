import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt(); // Rastgele bir tam sayı
        int randomIntWithinRange = random.nextInt(100); // 0-99 arası rastgele bir tam sayı
        double randomDouble = random.nextDouble(); // 0.0 ile 1.0 arasında rastgele bir double
        boolean randomBoolean = random.nextBoolean(); // Rastgele bir boolean

        System.out.println("Rastgele tam sayı: " + randomInt);
        System.out.println("0-99 arası rastgele tam sayı: " + randomIntWithinRange);
        System.out.println("Rastgele double: " + randomDouble);
        System.out.println("Rastgele boolean: " + randomBoolean);
    }
}
