import java.util.Scanner;

public class StringConcatExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınız?");
        String name = scanner.nextLine();
        String surname = scanner.nextLine();

        String welcomeMessage = "Hoşgeldin,";
        String welcomeMessageFull = welcomeMessage.concat(" ").concat(name).concat(" ").concat(surname);
        System.out.println(welcomeMessageFull);

        StringBuilder welcomeMsg = new StringBuilder("Hoşgeldin.");
        welcomeMsg.append(name).append(" ").append(surname);
        System.out.println("Welcome" + welcomeMsg);

        String str2 = "Irem";
        String str4 = "Irem";
        String str5 = "IreM";
        StringBuilder str3 = new StringBuilder("Irem");

        if(str2.equals(str5)){
            System.out.println("Adaşsınız");
        }
        if(str2.equalsIgnoreCase(str5)){
            System.out.println("Denem");
        }


    }
}
