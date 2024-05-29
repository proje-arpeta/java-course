import java.util.Scanner;

public class MethodsExamples {

    public void greeting(){
        System.out.println("Merhaba Dünya!");
    }
    public  void greetingWithMessage(String text){
        System.out.println(text);
    }
    public int add(int number1, int number2){
        return number1 + number2;
    }
    public int calculator(int number1, int number2, String operation){
        int returnValue = 0;
         switch (operation){
             case "+":
                 returnValue =   number1 + number2;
                 break;
             case "-":
                 returnValue =   number1 - number2;
                 break;
             case "*":
                 returnValue =   number1 * number2;
                 break;
             case "/":
                 returnValue =   number1 / number2;
                 break;
             default:
                 break;

         }
         return  returnValue;
    }



    public static void main(String[] args) {
        MethodsExamples example = new MethodsExamples();
        example.greeting();
        example.greetingWithMessage("Hadi bunu yazdır");
        example.greetingWithMessage("Java Öğreniyrum");
        example.greetingWithMessage("Güneşli bir gün");
        int toplam = example.add(10,20);
        int toplam2 = example.add(100,300);
        example.greetingWithMessage("Toplam değeri " + toplam);
        example.greetingWithMessage("Toplam değeri " + toplam2);
        int multiply = example.calculator(1,2,"+");
        System.out.println("mutiply " + multiply);

    }
}
