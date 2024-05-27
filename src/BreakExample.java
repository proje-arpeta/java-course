public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Döngüden çık
            }
            System.out.println(i);
        }
    }
}
