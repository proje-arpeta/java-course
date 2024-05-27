public class LoopExamples {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i değeri: " + i);
        }

        int index = 0;
        while (index < 5) {
            System.out.println("i değeri: " + index);
            index++;
        }




        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Sayı: " + num);
        }

    }
}
