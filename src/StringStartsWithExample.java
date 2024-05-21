public class StringStartsWithExample {
    public static void main(String[] args) {
        String productCode = "SMSG-0001-064";
        boolean isThatIphone = productCode.startsWith("IPHA");
        System.out.println("İphone mu?" + isThatIphone);
        if (productCode.startsWith("IPHN")){
            System.out.println("Stokta mevcut değil");
        }else{
            System.out.println("Sepete eklenebilir");
        }

        boolean isThat64 = productCode.endsWith("064");
        System.out.println("isthat64" + isThat64);



    }
}
