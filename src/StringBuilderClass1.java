public class StringBuilderClass1 {
    public static void main(String[] args) {
        String text = "sljlksdf";
        StringBuilder sbText = new StringBuilder("arslan");

        sbText.append(" arslan").append(" iskenderun").append(" yaş 18");
        System.out.println("added text" + sbText);

        char char2 = sbText.charAt(2);
        System.out.println("2.index" +  char2);
        String sbTextSting = sbText.toString();

        sbText.insert(3, "irem");

        System.out.println(sbText);
        int wordIndex = sbText.indexOf("irem");
        System.out.println(wordIndex);
        sbText.delete(wordIndex,4 + wordIndex);
        System.out.println(sbText);

        sbText.replace(0, 10, "Java");
        System.out.println(sbText);

        // text = "irem" [i,r,e,m] text.charAt(1)
        // array =[ire,m,arslan] array[1]
    }
}
