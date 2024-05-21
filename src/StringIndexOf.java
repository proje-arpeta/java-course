public class StringIndexOf {
    public static void main(String[] args) {
        String courseName = "Java Başlangıç Sınıfı-0100 İrem Arslan";
        int iIndex = courseName.indexOf("İrem");
        System.out.println("index" + iIndex);
        String course = courseName.substring(0,27);
        System.out.println("course Name" +  course);
        String iName = courseName.substring(27);
        System.out.println("Eğitmen Adı" + iName);
        String correctedCourseName = course + ' ' +  "Eğitmen: " + iName;
        System.out.println("correctedCoursename"+ correctedCourseName);

        String productName = "HRCSX01002X2005";
        int productCodeIndex = productName.indexOf("X");
        String productCode = productName.substring(productCodeIndex);
       System.out.println(productCode);

    }
}
