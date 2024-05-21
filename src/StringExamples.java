import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
        String name = "irem arslan";
        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adı Giriniz: ");
        String userName = scanner.nextLine() ;

        System.out.println("Girilen kullanıcı adı Büyük Harflerle" + userName.toUpperCase());
        System.out.println("Girilen kullanıcı adı Küçük Harflerle " + userName.toLowerCase());
        int userNameLenght = userName.length();
        System.out.println("Uzunluk: " + userNameLenght);
        if (userName.length() < 8){
            System.out.println("Lütfen minumum 8 krakterlik bir kullancı adı giriniz");
        }
        //["i","r","e","m"]
        //["a","r","s","l"];
        char karakter = userName.charAt(2);
        System.out.println("2.index değeri " + karakter);
        char karakter3 = userName.charAt(3);
        System.out.println("3.idex değeri" + karakter3);
        System.out.println("Kredi Kartı Numarsaınızı giriniz:");
        String creditCardNumber = scanner.nextLine();
        int beginIndex = creditCardNumber.length() - 4;
        System.out.println("Başlayacağımız karakter" + beginIndex);
        String last4digit = creditCardNumber.substring(beginIndex);
        System.out.println("Son dört hanesi" + last4digit);

        String first4digit = creditCardNumber.substring(0,4);
        System.out.println("İlk 4 tanesi" + first4digit);

        String visaNumbers = "1234";
        String masterNumbers = "8391";
        String aeNumbers = "3456";

        if (first4digit.equals(visaNumbers)){
            System.out.println("visa");
        }

        System.out.println("Adresinizi Giriniz");
        String address = scanner.nextLine();
        boolean isThatTurkish = address.contains("ö");
        System.out.println("Turkçe mi?" + isThatTurkish);
        if(isThatTurkish){
            System.out.println("Adres yanlış.Türkçe karakter kullanılamaz");
        }else{
            System.out.println("Adres doğrulaması başarılı");
        }

        System.out.println("Sifre giriniz:");
        String password = scanner.nextLine();
        System.out.println("Sifreyi Tekrar Giriniz");
        String confirmPassword = scanner.nextLine();
        boolean isPasswordMatch = password.equals(confirmPassword);
        if( password == confirmPassword){

        }else{

        }
        System.out.println("Şifreler uyuşuyor mu?" + isPasswordMatch);
        if(isPasswordMatch){
            System.out.println("Şifre oluşturuldu");
        }else{
            System.out.println("Şifreler uyuşmuyor. Tekrar giriniz");
        }






    }
}
