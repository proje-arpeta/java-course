import java.util.Scanner;

public class LicensePlateValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Plaka numarasını girin: ");
        String licensePlate = scanner.nextLine();

        String platePattern = "^[0-9]{2} [A-Z]{1,3} [0-9]{1,4}$";

        boolean isValidPlate = licensePlate.matches(platePattern);
        System.out.println("Geçerli plaka mı? " + isValidPlate);
    }
}
