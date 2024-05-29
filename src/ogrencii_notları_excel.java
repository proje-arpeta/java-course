

import java.util.Random;
import java.util.Scanner;

public class ogrencii_notları_excel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notlar = 3;
        Random random = new Random();
        int[] notlar2 = new int[notlar];
        int[] notlar3=new int[notlar];
        for (int i1 = 0; i1 < notlar;++i1) {

            int rastgeleNot = random.nextInt(notlar + 1);
            notlar2[i1] = rastgeleNot;

            System.out.println("ograncinin notu2: " + notlar2);
            for (int sayi : notlar2) {
                System.out.print("sayi:"+ " "+sayi);
                break;

            }
            System.out.print("Sayi= ");
            for (int i2 = 0; i2 < notlar; ++i2) {

                int rastgeleNot2 = random.nextInt(notlar + 1);
                notlar3[i2] = rastgeleNot2;
                System.out.println("ograncinin notu2: " + notlar3[i2]);
            }
            for (int sayi2 : notlar3) {
                System.out.print("sayi2:" + " "+sayi2);
                break;

            }
            System.out.print("sayi2= ");
            double toplam1 = 0;
            for (int sayi : notlar2) {
                toplam1 += sayi;
            }
            double toplam2 = 0;
            for (int sayi2 : notlar3) {
                toplam2 += sayi2;
            }
             System.out.println("toplam1 " + toplam1);
             System.out.println("toplam2 " + toplam2);
            double genelOrtalama = ((toplam1 + toplam2) /2 );
            System.out.println("Genel Ortalama: " + genelOrtalama);


            if (genelOrtalama < 45) {
                System.out.println("=sınıfta kaldı");
            } else if (genelOrtalama < 55) {
                System.out.println("=kötü ile geçti");

            } else if (genelOrtalama < 70) {
                System.out.println("=orta ile geçti");
            } else if (genelOrtalama < 85) {
                System.out.println("=iyi ile geçti");
            } else {
                System.out.println("=pekiyi ile geçti");
            }
            break;

        }




    }
}