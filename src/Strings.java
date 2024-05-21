
import java.util.Scanner;


public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(str1);

        int strLength = str1.length();
        System.out.println(strLength); // 11

        char strChar = str1.charAt(3);
        System.out.println(strChar); // l

        String substr = str1.substring(6);
        System.out.println(substr); // World

        String substr2 = str1.substring(0,5);
        System.out.println(substr2); // Hello

        String str2 = "Java Öğreniyorum";
        boolean containsA = str2.contains("a");
        boolean containsB = str2.contains("b");

        System.out.println(containsA); // true
        System.out.println(containsB); // false

        String str3 = "Hello";
        boolean isEqual = str1.equals(str3);
        boolean isEqual2 = substr2.equals(str3);
        System.out.println(isEqual); // False
        System.out.println(isEqual2); // true

        String str4 = "İrem Arslan";
        String strUpper = str4.toUpperCase();
        System.out.println(strUpper); // İREM ARSLAN

        String name = "İREM ARSLAN";
        String strLower = name.toLowerCase();
        System.out.println(strLower); // irem arslan

        String strWithSpaces = "  Java String Sınıfı    ";
        String strTrimmed = strWithSpaces.trim();
        System.out.println(strTrimmed);//Java String Sınıfı

        String courseTitle = "Fullstack web development course";
        String changedString = courseTitle.replace("e", "1");
        System.out.println(changedString);//Fullstack w1b d1v1lopm1nt cours1


        String fullName = "İrem Arslan";
        String[] words = fullName.split(" ");
        // words = ["İrem", "Arslan"]
        for(String word: words){
            System.out.println(word);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz:");
        String userName = scanner.nextLine();
        boolean isUserNameEmpty = userName.isEmpty();

        if(isUserNameEmpty){
           System.out.println("Lütfen kullanıcı adınızı giriniz.");
        }else{
           System.out.println("Hoşgeldin " +  userName);
        }

        String x = "i 2 3 3 43 ";
        String[] xs = x.split(" ");
        System.out.println(xs.length);


        String str = "Hello, World!";

        boolean result1 = str.startsWith("Hello"); // true
        boolean result2 = str.startsWith("World"); // false

        // Belirli bir pozisyondan itibaren kontrol
        boolean result3 = str.startsWith("World", 7); // true

        System.out.println("'Hello': " + result1);
        System.out.println("Starts with 'World': " + result2);
        System.out.println("Starts with 'World' from index 7: " + result3);


        boolean resultEnd1 = str.endsWith("World!"); // true
        boolean resultEnd2 = str.endsWith("Hello"); // false

        System.out.println("Ends with 'World!': " + resultEnd1);
        System.out.println("Ends with 'Hello': " + resultEnd2);

        String strExample = "Hello, World!";

        int index1 = strExample.indexOf('o'); // 4
        int index2 = strExample.indexOf('o', 5); // 8
        int index3 = strExample.indexOf("World"); // 7
        int index4 = strExample.indexOf("Java"); // -1

        System.out.println("Index of 'o': " + index1);
        System.out.println("Index of 'o' from index 5: " + index2);
        System.out.println("Index of 'World': " + index3);
        System.out.println("Index of 'Java': " + index4);

        String strLastExample = "Hello, World!";

        int indexLast1 = strLastExample.lastIndexOf('o'); // 8
        int indexLast2 = strLastExample.lastIndexOf('o', 5); // 4
        int indexLast3 = strLastExample.lastIndexOf("World"); // 7
        int indexLast4 = strLastExample.lastIndexOf("Java"); // -1

        System.out.println("Last index of 'o': " + indexLast1);
        System.out.println("Last index of 'o' before index 5: " + indexLast2);
        System.out.println("Last index of 'World': " + indexLast3);
        System.out.println("Last index of 'Java': " + indexLast4);


        String strConcat1 = "Hello";
        String strConcat2 = "World";

        // concat  ile birleştirelim
        String result = strConcat1.concat(", ")
                .concat(strConcat2)
                .concat("!");

        System.out.println(result);
        // Output: Hello, World!


        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ").append("World").append("!");

        String resultOfStrings = sb.toString();
        System.out.println(resultOfStrings); // Output: Hello, World!


        String compare1 = "Hello";
        String compare2 = "Hello";
        String compare3 = new String("Hello");

        // Karşılaştırma
        System.out.println("str1 == str2: " + (compare1.equals(compare2))); // true
        System.out.println("str1 == str3: " + (compare1.equals(compare3))); // true



        String expectedUsername = "Admin";

        System.out.print("Lütfen kullanıcı adınızı girin: ");
        String inputUsername = scanner.nextLine();

        if (expectedUsername.equalsIgnoreCase(inputUsername)) {
            System.out.println("Kullanıcı adı doğru.");
        } else {
            System.out.println("Kullanıcı adı yanlış.");
        }

        scanner.close();

    }
}
