public class ArrayStart {
    public static void main(String[] args) {
        String[] isimler = {"irem","rojda","sinem"};
        System.out.println(isimler[1]);
        int[] numaralar = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(numaralar[3]);
        System.out.println(numaralar);
        int total = 0;
        for (int i = 0; i < numaralar.length ; i++) {
            int value = numaralar[i]; // value = 2
            System.out.println(value); //2
            total = total + value; // 3
        }

        String x = "";

        System.out.println("Toplam: " + total);
        System.out.println("Ortalama: " + total / numaralar.length);

        int total2 = 0;
        for(int value: numaralar){
            System.out.println(value);
            total2 = total2 + value;
        }
        System.out.println("Toplam: " + total2);
        System.out.println("Ortalama: " + total2 / numaralar.length);
    }
}
