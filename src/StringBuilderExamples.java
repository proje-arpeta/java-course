import java.util.Scanner;

public class StringBuilderExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = "sss";

        StringBuilder userName = new StringBuilder("irem");
        userName.append(" arslan").append("Yaş: ").append("Şehir:").append(" Meslek:");
        System.out.println("userName" + userName);
        userName.insert(10, "-------");
        System.out.println("userName" + userName);
       int indexOfSehir =  userName.indexOf("Şehir");
       System.out.println(indexOfSehir);
       userName.insert(indexOfSehir,"Yaşadığı ");
        System.out.println(userName);
        userName.delete(3,10);
        System.out.println( userName);
        int lengthOfUserName = userName.length();
        String  deletedWords = userName.substring(20);
        System.out.println( deletedWords);
        userName.delete(20, lengthOfUserName);
        System.out.println( userName);
        userName.replace(0,3,"xyzt");
        System.out.println( userName);

        StringBuilder iName = new StringBuilder();
        String xyz = "sldslkdlsdk";
        iName.append("irem").append(" arslan");
        iName.insert(3,"xxx");
        iName.reverse();
        System.out.println( iName);
        String inameString = iName.toString();
        System.out.println( inameString);






    }
}
