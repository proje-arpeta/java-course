import java.util.Arrays;
import java.util.Scanner;

public class ArrayCoppyOfExample {

    public void printArayElements(String[] list){
        for (int i = 0; i < list.length ; i++) {
            System.out.println("Tweet froom method " + list[i]);
        }
    }
    public String[] addElementToArray(String[] arrayTobeUsed, String elementTodd){
        String[] newArray = Arrays.copyOf(arrayTobeUsed,arrayTobeUsed.length + 1 );
        newArray[newArray.length - 1 ] = elementTodd;
        return newArray;
    }
    public static void main(String[] args) {
        ArrayCoppyOfExample project = new ArrayCoppyOfExample();
        String[] users = {"irem","arslan","ece","deniz"};
        String[] tweets = {"Java öğrenmeye başladım", "Artık bende developerım"};

        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.println("Tweet");
            String  tweet = scanner.nextLine();

            tweets = project.addElementToArray(tweets, tweet);
            for (int i = 0; i < tweets.length ; i++) {
                System.out.println("Tweet from loop " + tweets[i]);
            }
            project.printArayElements(tweets);
            users    = project.addElementToArray(users, "irem");
            project.printArayElements(users);

            if (tweet.equals("Çıkış")){
                break;
            }
        }
    }
}
