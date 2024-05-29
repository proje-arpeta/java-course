import java.util.Arrays;

public class MethodAndArrays {
    public static void main(String[] args) {
        int[] numbers = {1,500,80,10,40,50};
        String[] names = {"irem","deniz","dilara","nurseli","ata","cem"};
        Arrays.sort(numbers);
        Arrays.sort(names);
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }

        int indexOf20 = Arrays.binarySearch(numbers, 40);
        System.out.println("indexOf20 "+  indexOf20);

        int indexOfIrem = Arrays.binarySearch(names,"irem");
        System.out.println("indexOfIrem" + indexOfIrem);
    }
}
