public class LocalVariableExample {
    public int instanceVar; // instance değişkeni

    public void changeValue(){
        this.instanceVar = 23;
        System.out.println(this.instanceVar);
    }
    public void printNumber(){
        int number = 10; // local değişken
        System.out.println(number);
    }

    public void checkAge(int age ){
        String message1 = "18 yaşından büyük"; // local değişken
        String message2 = "18 yaşından küçük"; // local değişken
        if (age < 18){
           System.out.println(message2);
        }else{
            System.out.println(message1);
        }

    }

    public static void main(String[] args) {
        int age = 8;
        System.out.println(age);
        LocalVariableExample example = new LocalVariableExample();
        example.printNumber();
        example.checkAge(30);
        example.checkAge(15);
        example.changeValue();
    }
}
