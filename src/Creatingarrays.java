public class Creatingarrays {
    public static void main(String[] args) {
        int[] numbers; // Bir int dizisi tanımlama
        numbers = new int[5]; // 5 elemanlı bir int dizisi oluşturma
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        // numbers = {1,2,3,4,5}
        int[] numbers2 = {1,2,3,4,5};// 5 elemanlı bir int dizisini başlatma
        // numbers2[0] => 1,numbers2[1] => 2 numbers2[2] => 3 numbers2[3] => 4 numbers2[4] = 5
        int number2Lenght = numbers2.length;
        System.out.println("Dizinin uzunluğu" + number2Lenght); // 5

    }
}
