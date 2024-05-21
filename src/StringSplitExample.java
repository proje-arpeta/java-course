public class StringSplitExample {
    public static void main(String[] args) {
        String todoString = "Uyan, Java Öğren, Pratik Yap, Uyu";
        //
        // ,e göre split ettim ["Uyan"," Java Öğren"," Prtaik Yap"," Uyu"]
        // , e göre split ettim ["Uyan","Java Öğren","Prtaik Yap","Uyu"]
        String[]  todoList = todoString.split(",");
        int todoListLength = todoList.length;
        System.out.println(todoListLength);
        System.out.println(todoList[0]);
        System.out.println(todoList[1]);
        System.out.println(todoList[2]);
        System.out.println(todoList[3]);
        System.out.println(todoList.length - 1);
        System.out.println(todoList[todoList.length - 1]);

        for (int i = 0; i < todoList.length ; i++) { // 0 1  2 3 4
            // i = 3;
           System.out.println(todoList[i]); // Uyan  Java Öğren  Prtaik Yap Uyu
        }


        String classListText = "Rojda, İrem Eda, irem, hacer, sinem, dilara, beyza, gözde, melodi, neslihan, büşra, damla, şule";
        String[] classListArray = classListText.split(",");
        int classCount = classListArray.length;
        System.out.println("Öğrenci Sayısı: " + classCount);
        for (int i = 0; i < classCount; i++) {
            String correctedName = classListArray[i].trim();
            int count = i + 1;
            System.out.println(count + ". : " +  correctedName);

        }
String ornekMetin = "İrem-string-hava-charat-xxx-yyy";



    }
}
