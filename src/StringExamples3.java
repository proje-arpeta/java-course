import java.util.Scanner;

public class StringExamples3 {

    public void checkCreditCard(String control){
        String visaControl = "1234";
        String masterControl = "1235";
        if( control.equals(visaControl)){
            System.out.println("Visa Kart");
        } else if (control.equals(masterControl)) {
            System.out.println("Master Kart");
        }else{
            System.out.println("Kredi kartı numaranızı kontrol edin");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz" );
        String userName = scanner.nextLine();
        System.out.println("Karakter sayısı" + userName.length());
        int userNameLength = userName.length();
        if (userNameLength < 8){
            System.out.println("Kullancı adı 8 karakterden küçük olamaz");
        }else{
            System.out.println("Kullancı adı doğru");
        }
        System.out.println("Kredi kartı numarasını giriniz");
        String creditCardNumber = scanner.nextLine();
        String last4digit = creditCardNumber.substring(12);
        System.out.println("Son 4 hane" + last4digit);
        int creditCardDigits = creditCardNumber.length() ;
        System.out.println("Digit:" + creditCardDigits);
        int beginIndex = creditCardDigits - 4 ;
        System.out.println("Son 4 hanesi" + creditCardNumber.substring(beginIndex));

        String first4digit = creditCardNumber.substring(0,4);
        System.out.println("ilk 4 tanesi" + first4digit);
        StringExamples3 example = new StringExamples3();
        example.checkCreditCard(first4digit);

       System.out.println("Adres giriniz");
       String adress = scanner.nextLine();
       boolean isThatTurkish = adress.contains("ö");
       if (isThatTurkish){
           System.out.println("Adres türkçe karakter içeremez");
       }else{
           System.out.println("Adres doğru");
       }
       System.out.println("Şifre giriniz");
       String password = scanner.nextLine();
        System.out.println("Şifreyi tekrar giriniz");
       String confirmPassword = scanner.nextLine();
       if (password.equals(confirmPassword)){
           System.out.println("Giriş başarılı");
       }else{
           System.out.println("Şifreler uyuşmuyor tekrar giriniz");
       }

       String  productName = "Bilgisayar L-0293832989182 15inch";
       System.out.println("Ürünler" + productName.toUpperCase());
       System.out.println("Ürünler küçük" + productName.toLowerCase());

    }
}
