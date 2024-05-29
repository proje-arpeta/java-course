import java.util.Arrays;
import java.util.Scanner;

public class InstagramProject {
    public void operationMessage(){
        System.out.println("Yapabileceğiniz işlemler");
        System.out.println("1=> Takip Listesi");
        System.out.println("2=> Takipçi Listesi");
        System.out.println("3=> Arama Listesi");
        System.out.println("4=> Takip ekle");
        System.out.println("5=> Takipçi ekle");
        System.out.println("0=> Çıkış");
        System.out.println("Yapmak istediğiniz İşlemi Giriniz");
    }

    public int arrayCount(String[] array){
       return  array.length;
    }

    public  void returnArrayStrings(String[] array, String text){
        System.out.println(text + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public  void   searchString(String[] array, String search){
         Arrays.sort(array);
         int index = Arrays.binarySearch(array,search);
         if(index >= 0){
             System.out.println("Bulundu");
         }else{
             System.out.println("Bulunamadı");
         }
    }
    public boolean isUserFound(String[] array,String search){
        boolean returnValue = false;
        Arrays.sort(array);
        int index = Arrays.binarySearch(array,search);
        if(index >= 0){
            returnValue = true;
        }
        return returnValue;
    }
    public String[] addElementToArray(String[] original, String newElement) {
         //"irem","nurseli","ece" "dilara"
        String[] newFollowings = Arrays.copyOf(original, original.length +1);
        newFollowings[newFollowings.length - 1] = newElement;
        return  newFollowings;
    }
    public static void main(String[] args) {
        InstagramProject project = new InstagramProject();
        Scanner scanner = new Scanner(System.in);
        String[] followings = {"irem","ece","büşra","deniz","ali"};
        String[] followers = {"irem","ece","büşra","deniz","ali"};
        String[] users = {"irem","ece","büşra","deniz","ali","hacer","hatice","ahmet","remzi","onur","cenk","aslı","ufuk","ceren"};
        project.operationMessage();
        int operation = scanner.nextInt();

        switch (operation){
            case 1:
                project.returnArrayStrings(followings, "Takip Sayısı ");
                break;
            case 2:
                project.returnArrayStrings(followers, "Takipçi Sayısı ");
                break;
            case 3:

                scanner.nextLine();
                String search = scanner.nextLine();
                project.searchString(followings, search);
                project.searchString(followers, search);
            case 4:
                System.out.println("Eklemek istediğiniz kullanıcı");
                scanner.nextLine();
                String userName = scanner.nextLine();
                boolean isFound = project.isUserFound(users,userName);
                if (isFound) {
                    followings = project.addElementToArray(followings, userName);
                    project.returnArrayStrings(followings, "Takip Sayısı ");
                    break;
                }else{
                    System.out.println("Böyle bir kullancı yok");
                }

            default:
                break;
        }


    }
}
