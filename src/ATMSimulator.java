import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Para Yatırma");
            System.out.println("2. Para Çekme");
            System.out.println("3. Bakiye Sorgulama");
            System.out.println("4. Çıkış");
            System.out.print("Bir işlem seçin: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Yatırılacak miktarı girin: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("Yeni Bakiye: " + balance);
                    break;
                case 2:
                    System.out.print("Çekilecek miktarı girin: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Yeni Bakiye: " + balance);
                    } else {
                        System.out.println("Yetersiz bakiye!");
                    }
                    break;
                case 3:
                    System.out.println("Bakiye: " + balance);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    break;
            }
        }
    }
}
