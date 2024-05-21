import java.util.Scanner;

public class StringExample3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String userName;
      while (true){
          System.out.println("Kullanıcı adı giriniz");
          userName = scanner.nextLine();
          System.out.println("girilen kullanıcı adı" + userName);
          if (userName.length() > 8){
              System.out.println("Hoşgedin " + userName.substring(0,4));
              break;
          }else{
              System.out.println("Kullanıcı adı 8 karakterden az olamaz");
          }

          String strCsv = "IremXArslanXArpetaX2024";
          String[] strArray = strCsv.split("X"); // ["Irem","Arslan","Arpeta","2024"]
          int strLength = strArray.length;
          System.out.println(strArray[0]); // Irem
          System.out.println(strArray[1]); // arslan
          System.out.println(strArray[2]); // Arpeta
          System.out.println(strArray[3]); // 2024

          for (int i = 0; i < strLength ; i++) { // 0  1 2 3
              System.out.println(strArray[i]);
          } // 1 2 3


      }



    }
}
