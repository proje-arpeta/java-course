import java.util.Random;
import java.util.Scanner;

public class RGBExample {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç farklı renk türetmek istiyorsun?");
        int colorCount = scanner.nextInt();
        StringBuilder rgbText = new StringBuilder("Üretilen renkler: ");
        System.out.println("RgbText" + rgbText);
            int red = 0;
            int blue = 0;
            int green = 0;
        for (int i = 0; i < colorCount; i++) {
             red = random.nextInt(255);
             green = random.nextInt(255);
             blue = random.nextInt(255);
            rgbText.append("rgb(").append(red).append(",").append(green).append(",").append(blue).append(")").append(" ");

        }

        String regex = "Merhaba dünya yaz kış limon meyve deneme can sucuk";
        // kelimeler = {Merhaba, dünya, kış , limon, meyve, deneme , can, sucuk}
        // kelimeler[0] kelimler.lengt => 8

        System.out.println("rgbText" + rgbText);
    }
}
