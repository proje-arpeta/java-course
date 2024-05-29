import java.util.Scanner;

public class MethodExamples2 {
    public void greeting(){
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
          System.out.println("Merhaba Dünya!");
    }
    public  void greetingWithMessage(String name){
        System.out.println("Merhaba " + name);
    }
    public int add(int number1, int number2){
        return  number1 + number2;
    }
    public String stringConcat(String name, String surname){
         return  name + " " + surname;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public int calculator(int number1,int number2, String operation){
        int returnValue = 0;
        switch (operation){
            case "+":
                returnValue = number1 + number2;
                break;
            case "-":
                returnValue = number2 - number2;
            break;
            default:
                break;
        }
        return returnValue;
    }
//multiply 2 tane numara

    public static void main(String[] args) {
        MethodExamples2 example = new MethodExamples2();
        int result2 = example.multiply(10,300);
        String name = "irem";
        example.greeting();
        example.greetingWithMessage("İrem");
        int age = example.add(10,20);
        System.out.println("Yaş " + age);
        String fullName = example.stringConcat("irem", "arslan");
        System.out.println("Fylll nme " + fullName);
        int result = example.calculator(10,5,"+" );
        System.out.println("Result " + result);
    }
}
