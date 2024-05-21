public class VariableExamples2 {
   public int count = 0;
   static int price = 300;

    public void displayAge(int number){
        int age = number; // local değişken
        System.out.println("Display Age" + age);
        this.count = this.count + 1;
        System.out.println("Count :" + this.count);
        price = price + 30;
        System.out.println("Fiyat" + price);
    }

    public static void main(String[] args) {
        System.out.println("Merhaba");
        VariableExamples2 example = new VariableExamples2();
        example.displayAge(10);
        example.displayAge(20);
        example.displayAge(17);
        example.displayAge(50);
        example.displayAge(100);


    }
}
