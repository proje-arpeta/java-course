public class MethodExample {
    public void greet() {
        System.out.println("Merhaba!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    // Parametresiz ve dönüş değeri olmayan yöntem
    public void printMessage() {
        System.out.println("Bu bir mesajdır.");
    }

    // Parametre alan ve dönüş değeri olmayan yöntem
    public void printNumber(int number) {
        System.out.println("Sayı: " + number);
    }

    // Parametre alan ve dönüş değeri olan yöntem
    public int multiply(int a, int b) {
        return a * b;
    }


    public static void main(String[] args) {
        MethodExample example = new MethodExample();
        example.greet();

        int sum = example.add(5, 3);
        System.out.println("Toplam: " + sum);


        example.printMessage(); // "Bu bir mesajdır." yazdırır

        example.printNumber(10); // "Sayı: 10" yazdırır

        int result = example.multiply(4, 5);
        System.out.println("Çarpım: " + result); // "Çarpım: 20" yazdırır
    }
}
