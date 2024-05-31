import java.util.Arrays;

public class CoppyOfExmpl {
    public static void main(String[] args) {
        String[] names = {"irem","arslan","arpeta"};
        String[] names2 = new String[names.length + 10]; // null null null null
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            names2[i] = names[i]; // irem  arslan arpeta
        }
        names2[3] = "deniz";
        names2[4] = "çağla";
        for (int i = 0; i <names2.length ; i++) {
            System.out.println(names2[i]);
        }

        names = names2;
        System.out.println("names" + names.length);

        String[] products = {"telefon","kitap","gözlük","elma","kivi"};
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = "lamba";
        for (int i = 0; i <products.length ; i++) {
            System.out.println("ürün " + products[i]);
        }




    }
}
