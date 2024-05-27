public class DongulerExamples {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int total = 0;
        while (total < 50){
            System.out.println(total);
            total = total + 1;
        }

        int counter = 0;
        do {
          counter = counter + 1;
          System.out.println("counter" + counter);
        }while (counter < 10);


        while (true){
            System.out.println("Break konmazsma sonsuz döngü");
            break;
        }

    }
}
