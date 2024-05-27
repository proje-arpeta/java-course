import java.util.Scanner;

public class InstagramCloneExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] followers = {"irem","ece","büşra","dilara","seda","ali","cem","cenk","derya","deniz"};
        String[] followings = {"derya","ece","nazım","sedef","ahmet","cenk", "mahmut"};

        int followerCount = followers.length;
        int followingCount = followings.length;
        System.out.println("Takiçi : " + followerCount);
        System.out.println("Takip : " + followingCount);

        System.out.println("1=>Tkipçi listesi, 2=> takip listesi");
        int operation = scanner .nextInt();

        System.out.println("Operations" + operation);
        switch (operation){
            case 1:
                System.out.println("1 e tıkladı");
                for (int i = 0; i < followerCount ; i++) {
                    String name = followers[i];
                    System.out.println(name);

                    for (int j = 0; j < followingCount; j++) {
                        String followingName = followings[j];
                        if  (name.equals(followingName)){
                            System.out.println("Ortak + " + followingName);
                        }
                    }
                }

                break;
            case 2:
                System.out.println("2 e tıkladı");
                for (String name: followings){
                    System.out.println(name);
                }
                break;
            default:
                System.out.println("Geçersinz");
                break;

        }
    }
}
