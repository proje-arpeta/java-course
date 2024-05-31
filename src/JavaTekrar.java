import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class JavaTekrar {
    public void operationMessage(){
        System.out.println("Yapabileceğiniz işlemler");
        System.out.println("1=> Takip Listesi");
        System.out.println("2=> Takipçi Listesi");
        System.out.println("3=> Arama Listesi");
        System.out.println("4=> Takip ekle");
        System.out.println("5=> Takipçi ekle");
        System.out.println("6=> Tarihçeyi göster");
        System.out.println("0=> Çıkış");
        System.out.println("Yapmak istediğiniz İşlemi Giriniz");
    }


   public void showArrayList(String[] xyz){
       for (int i = 0; i < xyz.length ; i++) {
           System.out.println("followings " + xyz[i]);
       }
   }

   public int method1(){
        return 10;
   }

   public double method2(){
        return 10.4;
   }

   public  boolean resitmiMethodu(int age){
       boolean resitmi = false;
       if (23 > 18){
           resitmi = true ;
       }else{
           resitmi = false;
       }
       return   resitmi;
   };
    public String   method4(){
        return "dkfjkdjfkdfj";
    }

    public String[] method5(){
        String[] x = {"irem","arslan"};
        return x;
    }
    public int[] method6(){
        int[] x = {1,2,3,4,5,5,4,3};
        return x;
    }

    public boolean isUserFound(String[] abc){
        Scanner sc = new Scanner(System.in);
        System.out.println("Aramak istediğiniz kullanıcı adı");
        sc.nextLine();
        String userNameSearch = sc.nextLine();
        Arrays.sort(abc);
        int indexOfName = Arrays.binarySearch(abc,userNameSearch );
        boolean isFound = false;
        if (indexOfName >= 0){
            System.out.println(userNameSearch + " bulundu");
            isFound = true;
        }else{
            System.out.println(userNameSearch + " bulunamadı");
        }
        return isFound;
    }

    public String[] searchAndAddToArray(String[] searchArray, String[] addArray){
        System.out.println("Eklemek istediğiniz kullanıcı adı");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String userSearch = sc.nextLine();
        Arrays.sort(searchArray);
        int userIndex = Arrays.binarySearch(searchArray, userSearch);
        boolean isUserFound = false;
        if (userIndex >= 0){
            isUserFound = true;
        }
        if (isUserFound){
            addArray = Arrays.copyOf(addArray, addArray.length + 1);
            addArray[addArray.length - 1] = userSearch;
        }

        return addArray;
    }
    public static void main(String[] args) {


        JavaTekrar project = new JavaTekrar();
        Scanner scanner = new Scanner(System.in);
        String[] followings = {"irem","ece","büşra","deniz","ali"};
        String[] followers = {"irem","ece","büşra","deniz","ali"};
        String[] users = {"irem","ece","büşra","deniz","ali","hacer","hatice","ahmet","remzi","onur","cenk","aslı","ufuk","ceren"};
        String[] logs = new String[0];

        project.operationMessage();
        int operation = scanner.nextInt();

        switch (operation){
            case 1:
                project.showArrayList(followings);
                break;
            case 2:
                project.showArrayList(followers);
                break;
            case 3:
                boolean follingFound = project.isUserFound(followings);
                 System.out.println("userFound" + follingFound);
              break;
            case 4:
             boolean followerFound = project.isUserFound(followers);
                System.out.println("userFound" + followerFound);
                break;
            case 5:
                followers = project.searchAndAddToArray(users,followers);
                project.showArrayList(followers);
                break;
            case 6:
                followings = project.searchAndAddToArray(users,followings);
                project.showArrayList(followings);
                break;
            case 23:
                project.showArrayList(users);
                break;
            default:
                break;
        }


    }
}
