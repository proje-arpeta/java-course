public class ArrayExample1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        // Dizi elemanlarına değer atama
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Dizi elemanlarını yazdırma
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Dizi başlatma
        int[] moreNumbers = {1, 2, 3, 4, 5};

        // Dizi elemanlarını yazdırma
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.println("moreNumbers[" + i + "] = " + moreNumbers[i]);
        }
    }
}
