public class StringDay2Class2 {
    public static void main(String[] args) {
        String str = "     Java öğreniyorum   ";
        System.out.println(str.length());
        String correctStr = str.trim();
        System.out.println(correctStr);
        System.out.println(correctStr.length());

        String str2 = "Merhaba 2023 hoşgeldin!. 2023 yılı bizim için çok güzel geldi.";
        String  str22024 = str2.replace("2023","2024" );
        System.out.println(str22024);
        String productCode = "PRD-2024-00001";
        String newProductcode = productCode.replace('-','*');
        System.out.println(newProductcode);



    }
}
