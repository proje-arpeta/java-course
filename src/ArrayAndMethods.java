import java.util.Arrays;

public class ArrayAndMethods {
    public static void main(String[] args) {
        String[] products = {"telefon","tablet","bilgisayar","elbise","eldiven","araba"};
        Arrays.sort(products);
        System.out.println("Ürünler " + products[0]);
        int index = Arrays.binarySearch(products,"araba");
        System.out.println("index " + index);

        String[] newproducts = Arrays.copyOf(products,20);
        for (int i = 0; i < newproducts.length ; i++) {
            System.out.println(newproducts[i]);
        }

    }
}
