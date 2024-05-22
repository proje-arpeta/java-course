import java.util.Scanner;

public class StringDay3Examples {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Adınız");
        String name = scaner.nextLine();
        System.out.println("Soyadınız");
        String surname = scaner.nextLine();

        String welcome = "Hoşgeldin!";
        String message = "Hoşgeldin " + name +' ' + surname;
        String message2 = welcome.concat(" ").concat(name).concat(" ").concat(surname);
        System.out.println("Mesaj 1" + message);
        System.out.println("Mesaj 2" + message2);
        System.out.println( 1 + 2);
        System.out.println("1" + "2");

        String userName = "İrem";
        String userName3 = "İrem";
        String userName2 = new String("İrem") ;

        if (userName == userName2){
            System.out.println("Eşit değil");
        }
        if (userName == userName3){
            System.out.println("Eşit");
        }

        StringBuilder userName4 = new StringBuilder("Hoşgeldin!");
        userName4.append(" ").append(name).append(" ").append(surname);
        System.out.println("userName 4" + userName4);
        String welcomeMessage = userName4.toString();
        System.out.println("welcomeMessage" + welcomeMessage);

        if (name.equals("admin")){
            System.out.println("Efendimiz hoşgeldiniz");
        }
        if (name.equalsIgnoreCase("admin")){
            System.out.println("Büyük ya da küçüğün önemi yok ");
        }

    }
}
