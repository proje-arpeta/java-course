import java.util.Scanner;

public class StringExamples2 {
    public void  checkUserName(String secondChar){
        String name = "irem";
        char firstCharacter = secondChar.charAt(0);
        System.out.println("Girilen DEğer"+ firstCharacter );

        char secondCharater = name.charAt(1);
        if (firstCharacter == secondCharater){
            System.out.println("Doğru");
        }else{
            System.out.println("Yanlış");
        }
    }

    //   Mext lokasyonunda bulunan
    //MESS-UYE-WIFI
    //M3SS1959*!
    public static void main(String[] args) {
        String name = "irem arslan";
        // ["i","r","e","m",]
       char secondChar =  name.charAt(1);
       System.out.println("secondChar :"+ secondChar);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anne kızlık soyadınızın 2.harfi");
        String checkValue = scanner.nextLine();


        StringExamples2 example = new StringExamples2();
        example.checkUserName(checkValue);


    }
}
