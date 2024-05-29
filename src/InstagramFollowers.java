import java.util.Scanner;

public class InstagramFollowers {
    public void operationMessages(){
        System.out.println("Hoşgeldin");
        System.out.println("1=> Takip Listesi");
        System.out.println("2=> Takipçi Listesi");
        System.out.println("3=> Arama");
        System.out.println("0=> Çıkış");
        System.out.println("Hangi işlemi yapmak istersin?");
    }

    public void printArrayList(String[] array, String title){
        System.out.println( title + " sayısı " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        InstagramFollowers project = new InstagramFollowers();
        Scanner scanner = new Scanner(System.in);
        String[] followers = {"irem arslan","Büşra","Gözde","Can","Yağmır","Ece","Barış"};
        String[] following = {"Gülgün","Demet","Dilara","Can","Yağmır","Ece","Barış","Ahmet","Yiğit","Derya"};

        project.operationMessages();
        int operation = scanner.nextInt();
         switch (operation){
             case 1:
                 project.printArrayList(followers,"Takiçi");
                 break;
              case 2:
                  project.printArrayList(following,"Takip");
                  break ;
              case 3:
                 System.out.println("Ara");
                 break;
             default:
                 System.out.println("Geçersiz işlem");
                 break;
         }

    }
}
