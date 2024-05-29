import java.util.Arrays;
import java.util.Scanner;

public class InstragProjecttExample {

    public void writingArrayElemtns(String[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    public  boolean foundSearchInArray(String[] array, String search){
        boolean returnValue = false;
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, search);
        if( index >= 0){

            System.out.println("Takipleştiyoruznuz");
            returnValue = true;
        }else{
            System.out.println("Takipleşmiyorsunuz");
        }
       return returnValue;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InstragProjecttExample project = new InstragProjecttExample();

        String[] followers = {"irem","ece"};
        String[] followingin = {"irem","ece","aslı"};
        String[] users = {"irem","ece","aslı","jhfjdhfjhd","123askdjkasjd"};

        project.writingArrayElemtns(followers);
        project.writingArrayElemtns(followingin);
       System.out.println("1=> Takipçide ara , 2=> takipte ara");
       int operation = scanner.nextInt();
       scanner.nextLine();
       switch (operation){
           case 1:
                System.out.println("Aramak istediğiniz kullanıcı adı");
                String userName = scanner.nextLine();
                boolean isFound = project.foundSearchInArray(followingin, userName);
               break;
           case 2:
               System.out.println("Aramak istediğiniz kullanıcı adı");
               String userName2 = scanner.nextLine();
               boolean isFound2 = project.foundSearchInArray(followers, userName2);
               boolean isFound3 = project.foundSearchInArray(followingin, userName2);

               break;
           default:
               break;
       }
    }
}
