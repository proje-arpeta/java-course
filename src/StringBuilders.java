public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // Hello World


        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.insert(5, ",");
        System.out.println(sb2.toString()); //  Hello,
        sb2.insert(6, " W");
        System.out.println(sb2.toString()); //  Hello, W

        StringBuilder sb3 = new StringBuilder("Hello, World");
        sb3.delete(5, 9);
        System.out.println(sb3.toString()); //   Hellorld



        StringBuilder sb4 = new StringBuilder("Hello, World");
        sb4.replace(5, 12, " Java");
        System.out.println(sb4.toString()); //  Hello Java

        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.reverse();
        System.out.println(sb5.toString()); //  olleH

        StringBuilder sb6 = new StringBuilder("Hello");
        String result = sb6.toString();
        System.out.println(result); //  Hello


    }
}
