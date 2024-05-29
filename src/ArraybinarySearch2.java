import java.util.Arrays;

public class ArraybinarySearch2 {

    public void returnArrayElements(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        ArraybinarySearch2 project = new ArraybinarySearch2();
        int[] numbers = {10,20,30,40,5,1,2,3,8,60};
        Arrays.sort(numbers);

        int indexOf = Arrays.binarySearch(numbers, 23);
        System.out.println("index Of" + indexOf);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] names = {"irem","arslan","ece","deniz","derya","zeynep","ahmet"};
        Arrays.sort(names);
        int indexOfString = Arrays.binarySearch(names,"zzzzzz");
        System.out.println("index of string " + indexOfString);
       project.returnArrayElements(names);
    }
}
