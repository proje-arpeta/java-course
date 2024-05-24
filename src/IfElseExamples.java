public class IfElseExamples {
    public static void main(String[] args) {
        int weight = 30;
        String gender = "Male";
        String beden = (weight < 50) ? "Small" : "Medium";
        boolean isThatNumber = (weight > 0) ? true : false;
        String message = (weight > 100) ? "jhkjdhfkjhfkjdhfkjdh" : "lgkjflkdjlkgjfdlkg";
        System.out.println("Message" + message);
        if (weight < 50) {
            beden = "small";
        } else {
            beden = "medium";
        }
        ;

    }
}
