public class LocalVariables {
    public void printNumber(){
        int localInt = 10; // local variable
        System.out.println(localInt);
    }
    public void checkNumber(int num) {
        if (num > 0) {
            String result = "Pozitif"; // Yerel değişken
            System.out.println("Girilen sayı " + result);
        } else {
            String result = "Negatif"; // Yerel değişken
            System.out.println("Girilen sayı " + result);
        }
    }
    public static void main(String[] args) {
        LocalVariables example = new LocalVariables();
        example.printNumber();
        example.checkNumber(10);
        example.checkNumber(-20);

        for (int i = 0; i < 10; i++) { // i => local variable
            System.out.println((i));
        }
    }
}
