import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class TwitterClone {
   public  void listArrays(String[] list){
       for (int i = 0; i < list.length; i++) {
           System.out.println(list[i]);
       }
   }
   public String[] addToList (String[] list, String text){
       String[]  newArray =  Arrays.copyOf(list, list.length + 1);
       newArray[newArray.length - 1] = text;
       return  newArray;
   };

   public  String[] addLog(String[] list, String text){
       LocalDateTime date = LocalDateTime.now();
       DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm");
       String dateOfHistory = date.format(formater);
       String logText = text + dateOfHistory;
      String[] newArray =  addToList(list,logText );
      return  newArray;
   }

   public void userLoggedInMessages(){
       System.out.println("4=> Takip Listesi");
       System.out.println("5=> Takipçi Listesi");
       System.out.println("6=> Tweet Listesi");
       System.out.println("7=> History");
       System.out.println("8=> Takip et");
       System.out.println("9=> Tweet at");
       System.out.println("10=> Çıkış yap");
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwitterClone project = new TwitterClone();
        // Kullanıcı bilgilerini bir arrayde tutalım username-password şeklinde
        String[] users = {"irem-arslan","cemre-2635625","cenk-dhsj!222"};
//        //Takip liste
        String[] followings = new String[0];
        // Takipçi
        String[] follower = new String[0];
        // Tweet
        String[] tweets = new String[0];
        // Log
        String[] logs = new String[0];

        System.out.println("Hoşgeldin!");
        System.out.println("1=> Giriş Yap");
        System.out.println("2=> Kayıt Ol");
        System.out.println("3=> Bize Ulaş");
        int operation = scanner.nextInt();
        scanner.nextLine();
        boolean isUserMatch = false;
        if (operation == 1){
            System.out.println("Kullanıcı Adı");
            String userName = scanner.nextLine();
            System.out.println("Şifre");
            String password = scanner.nextLine();
            String searchText = userName + "-" + password;
            Arrays.sort(users);
            int indexOfUser = Arrays.binarySearch(users, searchText);
            isUserMatch =  indexOfUser >=0 ;

            //Kullanıcı kontrolü yapabilmek için usrs arrayinde dönüp kullanıcı adı ve şifreyi ayırıyoruz
            for (int i = 0; i <users.length ; i++) {
                 String user = users[i];
                 String[] userInfo = user.split("-");
                 String uName = userInfo[0];
                 String uPassword = userInfo[1];
                 isUserMatch = uName.equals(userName) && uPassword.equals(password);
                 if (isUserMatch){
                     break;
                 }
            }
            if (isUserMatch){

                System.out.println("Hoşgeldin " + userName);
            }else{
                System.out.println("Kullanıcı adı veya şifre yanlış ");
            }
        } else if (operation == 2) {
            System.out.println("Kullanıcı Adı Griniz");
            String userName = scanner.nextLine();
            System.out.println("Şifre Griniz");
            String password = scanner.nextLine();
            System.out.println("Şifre Tekrarı");
            String cPassword = scanner.nextLine();
            isUserMatch = password.equals(cPassword);
            if (isUserMatch){
                users    = project.addToList(users, userName + '-' + password);
                logs     = project.addLog(logs,"Sisteme kayıt oldunuz");
               project.listArrays(users);
            }
        } else if (operation == 3) {

        } else {
            System.out.println("Yanlış tuşladınız");
        }

        if (isUserMatch){
            project.userLoggedInMessages();
            int operationLogedin = scanner.nextInt();
            scanner.nextLine();
            if (operationLogedin == 4){
                project.listArrays(followings);
            } else if (operationLogedin == 5) {
                project.listArrays(follower);
            } else if (operationLogedin == 6) {
                project.listArrays(tweets);
            } else if (operationLogedin ==7) {
                project.listArrays(logs);
            }else if (operationLogedin == 8){
                System.out.println("Kullanıcı adı");
                String searchUsername = scanner.nextLine();
                boolean isUserFound = false ;
                for (int i = 0; i <users.length ; i++) {
                    String user = users[i];
                    String[] userInfo = user.split("-");
                    String userName = userInfo[0];
                     isUserFound = userName.equals(searchUsername);
                     if (isUserFound){
                         break;
                     }
                }
                if (isUserFound){
                   followings = project.addToList(followings, searchUsername);
                    String logText = searchUsername + "ile takipleşmeye başladınız";
                    logs = project.addLog(logs, logText);
                }

;               project.listArrays(followings);
                project.listArrays(logs);
            }else if (operationLogedin ==9){
                System.out.println("Tweeti giriniz");
                String tweet = scanner.nextLine();
                tweets = project.addToList(tweets, tweet);
                logs = project.addLog(logs, "Twwet attınız.");

                project.listArrays(tweets);
                project.listArrays(logs);
            }else{

            }
        }

    }
}
