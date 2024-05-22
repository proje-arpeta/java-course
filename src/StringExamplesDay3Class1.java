import java.util.Scanner;

public class StringExamplesDay3Class1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adı");
        String userName = scanner.nextLine();
        boolean isUserNameEmpty = userName.isEmpty();
        int userNameLength = userName.length();
        System.out.println("Girilen kullanıcı adı karakter sayısı" + userNameLength);
        System.out.println("İs Empty? " + isUserNameEmpty);

        String productCode = "IPHNX0300X064";
        boolean isIphone = productCode.startsWith("IPHNX064X400");
        boolean is64 = productCode.endsWith("4");
        System.out.println("İhone mu?" + isIphone);
        System.out.println("64 mü?" + is64);
        String str = "Merhaba Java Dünyası ben geldim.";

        int indexOfWord = str.indexOf("Dünyası");
        System.out.println("İndex of Dünyası" + indexOfWord);
       String firsPart = str.substring(0,indexOfWord);
        System.out.println("firsPart" + firsPart);
        String secondPart = str.substring(indexOfWord);
        System.out.println("secondPArt" + secondPart);

        String corrected = firsPart + " Developer " + secondPart;
        System.out.println("corrcted"+ corrected);

        String[] sentences = str.split("Dünyası");
        System.out.println("Sentences"+  sentences[0]);
        String correctedSentence = sentences[0] + " Developer Dünyası" + sentences[1];
        System.out.println("corrected Sentence" + correctedSentence);

        int lasIndexOfE = str.lastIndexOf('e');
        System.out.println("enin son indexsi" + lasIndexOfE);





    }
}
