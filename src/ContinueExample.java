public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // i 5 olduğunda bu yinelemeyi atla
            }
            System.out.println(i);
        }
    }
}
