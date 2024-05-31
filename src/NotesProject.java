import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class NotesProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String[] notes = new String[0];
      String[] notes2 = {"Merhaba ","Ço güzel bir gün","java öreniyorum"};

        while (true){
            System.out.println("Neler yazmak istersin");
            String text = scanner.nextLine();
            LocalDateTime createdDate = LocalDateTime.now();
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm");
            String formattedCreatedDate = createdDate.format(formatDate);
            String textWithTarih = text + " Oluşturulma Tarihi: " + formattedCreatedDate;
            System.out.println(textWithTarih);
            String[] newArray = Arrays.copyOf(notes,notes.length + 1);
            newArray[newArray.length - 1] = textWithTarih;
            notes = newArray;
            for (int i = 0; i < notes.length; i++) {
                System.out.println("Not: " + notes[i]);
            }
            if(text.equals("Çıkış")){
                break;
            }
        }


        String[] newNotesArrayy = Arrays.copyOf(notes2,notes2.length + 1);
        // {"Merhaba ","Ço güzel bir gün","java öreniyorum",null}
        newNotesArrayy[3] = "Deneme";
        // {"Merhaba ","Ço güzel bir gün","java öreniyorum","deneme"}

    }
}
