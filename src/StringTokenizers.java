import java.util.StringTokenizer;

public class StringTokenizers {
    public static void main(String[] args) {
        String str = "Java is fun";
        StringTokenizer tokenizer = new StringTokenizer(str);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
            //Java
            //is
            //fun
        }


        String str2 = "Java,Python,C++,JavaScript,HTML,CSS,React,NodeJS";
        String delimiters = ",";
        StringTokenizer tokenizer2 = new StringTokenizer(str2, delimiters);

        while (tokenizer2.hasMoreTokens()) {
            String token = tokenizer2.nextToken();
            System.out.println(token);
        }

        String str3 = "Java,Python,C++,JavaScript,HTML,CSS,React,NodeJS";
        String delimiters2 = ",+";
        StringTokenizer tokenizer3 = new StringTokenizer(str3, delimiters2,true);

        while (tokenizer3.hasMoreTokens()) {
            String token = tokenizer3.nextToken();
            System.out.println(token);
        }
    }
}
