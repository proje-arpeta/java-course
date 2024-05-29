import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] names = {"irem","ece","deniz"};

        String[] names2 = Arrays.copyOf(names,10);
        names2[8] = "dilara";
        names2[5] = "Kübra";
        for (int i = 0; i <names2.length ; i++) {
System.out.println("Nesne =>" + names2[i]);
        }
        // Array of string
        // Yeni bir aray oluşturun bu aarayin kopyası arrayin boyutuun + 3 fazlası olsun.
    }
}
