public class ArrayExamples {
    public static void main(String[] args) {
        String ogrenci = "irem";
        String[] ogrenciler = {"irem","rojda","büşra","dilara"};
        System.out.println("ogrenci" + ogrenci);
        System.out.println("ogrenciler" + ogrenciler[0]);

        int numara = 10;
        int[] numaralar = {20,30,40,50,60};
        System.out.println("numara" + numara);
        System.out.println("numara" + numaralar[4]);

        int number ;
        int[] numbers ;
        numbers = new int[5]; // [0,0,0,0,0]
        numbers[0] = 5;
        numbers[1] = 13;
        numbers[2] = 27;
        numbers[3] = 30;
        numbers[4] = 45;
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            int newValue = value + (value * 10 / 100); // Yüzde 10 zam yaptık
            numbers[i] = newValue;
            System.out.println(numbers[i]);
        }
    }
}
