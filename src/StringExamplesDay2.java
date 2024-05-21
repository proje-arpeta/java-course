public class StringExamplesDay2 {
    public static void main(String[] args) {
        String str = "  Java Öğreniyorum    ";
        System.out.println(str.length());
        String trimmedStr = str.trim();
        System.out.println(trimmedStr);
        System.out.println(trimmedStr.length());

        String productCode = "PRD-2024-0004";
        String newProductCode = productCode.replace('-', ' ');
        System.out.println("Yeni Ürün kodu : " + newProductCode);

        String aboutUs = "Merhaba, biz 01-03-2023 yılında kurulan bir startup şirketiyiz. Yapay zeka ile dijital dönüşüm projeleri gerçekleştiriyoruz. 2023 yılı içerisinde dünyayı değiştirmeyi planlıyoruz. ";
        String  aboutUse2024 = aboutUs.replace("01-03-2023", "2024-03-01");
        System.out.println("Düzeltilmiş metin :" + aboutUse2024);

        String  aboutUse2024x=  aboutUs.replace("sss","aaaa");

        String toDoText = "Kitap al, müzik dinle, java öğren, uyu";
        String[] toDoList =  toDoText.split(",");
        // toDoList["Kitap al", " müzik dinle", " jav öğren", " uyu"];

        System.out.println("ToDoList uzunluğu : " + toDoList.length);
        System.out.println("ToDoList uzunluğu : " + toDoList[toDoList.length - 1]);

        for (int i = 0; i < toDoList.length ; i++) {
            String x = toDoList[i].trim();
            int counter = i + 1;
            System.out.println(counter + ": " +  x);
        }
    }

    // Bir metin oluştur. İÇerisinde . ile cümlelerden oluşsun. .
    // yı kullanarak bunu ayır.
    // Her bir cümleyi ekrana yazdır
    //Yazdırmadan önce boşluklar varsa başında sonunda kurtul

}
