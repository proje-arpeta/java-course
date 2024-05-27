import java.util.Scanner;

public class InstagramFollowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] followers = {"irem arslan","Büşra","Gözde","Can","Yağmır","Ece","Barış"};
        String[] following = {"Gülgün","Demet","Dilara","Can","Yağmır","Ece","Barış","Ahmet","Yiğit","Derya"};

        int followCount = followers.length;
        int followingCount = following.length;

        System.out.println("Takipçi Sayısı :" + followCount  );
        System.out.println("Takip Sayısı: " + followingCount);

         System.out.println("Takipçi Listesi için 1 e Takip Listesi için 2 ye basınız");
         int operation = scanner.nextInt();

         System.out.println("Operasyon :" +  operation );

         switch (operation){
             case 1:
                 for (int i = 0; i < followCount ; i++) {
                     String name = followers[i];
                     System.out.println(name);
                     for (int j = 0; j < followingCount ; j++) {
                           String followingName = following[j];
                           boolean isTheSame = followingName.equals(name);
                           if (isTheSame){
                               System.out.println("Ortak + " + followingName);
                           }

                     }
                 }
                 break;
                 case 2:
                    for(String name: following){
                        System.out.println(name);
                        for (int i = 0; i <followCount ; i++) {
                            String followerName = followers[i];
                            boolean isTheSame = followerName.equals(name);
                            if (isTheSame){
                                System.out.println("Ortak + " + followerName);
                            }
                        }
                    }
                    break ;
             default:
                 System.out.println("Geçersiz işlem");
                 break;
         }

    }
}
