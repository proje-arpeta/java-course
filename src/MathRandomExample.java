public class MathRandomExample {
    public static void main(String[] args) {
        double randomValue = Math.random();
        System.out.println("Rastgele double: " + randomValue);

        int randomInt = (int) (Math.random() * 100); // 0-99 arası rastgele bir tam sayı
        System.out.println("0-99 arası rastgele tam sayı: " + randomInt);
    }
}
