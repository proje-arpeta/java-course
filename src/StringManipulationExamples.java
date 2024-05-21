import java.util.Scanner;

public class StringManipulationExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Kullanıcıdan Ad ve Soyad Alın
        System.out.print("Adınızı girin: ");
        String firstName = scanner.nextLine();
        System.out.print("Soyadınızı girin: ");
        String lastName = scanner.nextLine();
        System.out.println("Adınız ve Soyadınız: " + firstName + " " + lastName);



        // 2. Kullanıcı Girdisinin Boş Olup Olmadığını Kontrol Edin
        System.out.print("Bir metin girin (boş kontrolü): ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("Girdiğiniz metin boş.");
        } else {
            System.out.println("Girdiğiniz metin: " + input);
        }

        // 3. Büyük/Küçük Harf Duyarlılığı Olmadan Karşılaştırma
        System.out.print("Birinci kelimeyi girin: ");
        String str1 = scanner.nextLine();
        System.out.print("İkinci kelimeyi girin: ");
        String str2 = scanner.nextLine();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Kelime 1 ve Kelime 2 eşittir.");
        } else {
            System.out.println("Kelime 1 ve Kelime 2 eşit değildir.");
        }

        // 4. Kullanıcı Adı ve Şifre Doğrulama
        String expectedUsername = "Admin";
        String expectedPassword = "Password123";
        System.out.print("Kullanıcı adınızı girin: ");
        String username = scanner.nextLine();
        System.out.print("Şifrenizi girin: ");
        String password = scanner.nextLine();
        if (expectedUsername.equalsIgnoreCase(username) && expectedPassword.equals(password)) {
            System.out.println("Giriş başarılı.");
        } else {
            System.out.println("Giriş başarısız.");
        }

        // 5. Metin İçinde Kelime Arama
        System.out.print("Bir metin girin: ");
        String text = scanner.nextLine();
        System.out.print("Aramak istediğiniz kelimeyi girin: ");
        String searchWord = scanner.nextLine();
        if (text.contains(searchWord)) {
            System.out.println("Metin içinde '" + searchWord + "' kelimesi bulunuyor.");
        } else {
            System.out.println("Metin içinde '" + searchWord + "' kelimesi bulunmuyor.");
        }

        // 6. Karakter Sayısını Bulma
        System.out.println("Metin " + text.length() + " karakterden oluşuyor.");

        // 7. Kelime Sayısını Bulma
        String[] words = text.split("\\s+");
        System.out.println("Metin " + words.length + " kelimeden oluşuyor.");

        // 8. Metni Ters Çevirme
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("Ters çevrilmiş metin: " + reversedText);


        // 9. Kelimeyi Belirli Bir İndeksten Bölme
        System.out.print("Bir kelime girin (bölmek için): ");
        String splitWord = scanner.nextLine();
        System.out.print("Bölmek istediğiniz indeks: ");
        int splitIndex = scanner.nextInt();
        scanner.nextLine(); // Buffer temizlemek için
        String part1 = splitWord.substring(0, splitIndex);
        String part2 = splitWord.substring(splitIndex);
        System.out.println("İlk parça: " + part1);
        System.out.println("İkinci parça: " + part2);

        // 10. Kullanıcıdan Bir Cümle Alın ve Her Kelimenin İlk Harfini Büyük Yapın
        System.out.print("Bir cümle girin: ");
        String sentence = scanner.nextLine();
        String[] sentenceWords = sentence.split("\\s+");
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String w : sentenceWords) {
            capitalizedSentence.append(w.substring(0, 1).toUpperCase())
                    .append(w.substring(1).toLowerCase())
                    .append(" ");
        }
        System.out.println("İlk harfleri büyük cümle: " + capitalizedSentence.toString().trim());

        // 11. Metindeki Belirli Bir Kelimenin Kaç Defa Geçtiğini Bulun
        System.out.print("Bir kelime girin (sayılarını bulmak için): ");
        String targetWord = scanner.nextLine();
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(targetWord)) {
                count++;
            }
        }
        System.out.println("'" + targetWord + "' kelimesi " + count + " defa geçiyor.");



        // 12. Kullanıcının Girdiği İki Metni Birleştirin
        System.out.print("Birinci metni girin: ");
        String firstText = scanner.nextLine();
        System.out.print("İkinci metni girin: ");
        String secondText = scanner.nextLine();
        System.out.println("Birleştirilmiş metin: " + firstText.concat(secondText));

        // 13. Belirli Bir Kelimenin Yerine Başka Bir Kelime Koyma
        System.out.print("Değiştirmek istediğiniz kelimeyi girin: ");
        String oldWord = scanner.nextLine();
        System.out.print("Yeni kelimeyi girin: ");
        String newWord = scanner.nextLine();
        String replacedText = text.replace(oldWord, newWord);
        System.out.println("'" + oldWord + "' yerine '" + newWord + "' koyuldu: " + replacedText);

        // 14. Metindeki Tüm Boşlukları Kaldırın
        String textWithoutSpaces = text.replaceAll("\\s+", "");
        System.out.println("Metin boşluklardan arındırıldı: " + textWithoutSpaces);

        // 15. Belirli Bir İndeksteki Karakteri Bulun
        System.out.print("Bir indeks girin: ");
        int charIndex = scanner.nextInt();
        scanner.nextLine(); // Buffer temizlemek için
        if (charIndex >= 0 && charIndex < text.length()) {
            char character = text.charAt(charIndex);
            System.out.println("İndeks " + charIndex + "'teki karakter: " + character);
        } else {
            System.out.println("Geçersiz indeks.");
        }

        // 16. Bir Cümlenin Sonuna Belirli Bir Kelime Ekleyin
        System.out.print("Bir kelime girin (cümle sonuna eklenecek): ");
        String wordToAdd = scanner.nextLine();
        String appendedSentence = text.concat(" " + wordToAdd);
        System.out.println("Cümleye '" + wordToAdd + "' eklendi: " + appendedSentence);


        // 17. Metindeki Tüm Harfleri Büyük Harfe Çevirin
        String upperCaseText = text.toUpperCase();
        System.out.println("Büyük harfli metin: " + upperCaseText);

        // 18. Metindeki Tüm Harfleri Küçük Harfe Çevirin
        String lowerCaseText = text.toLowerCase();
        System.out.println("Küçük harfli metin: " + lowerCaseText);

        // 19. Bir Cümlenin Başındaki ve Sonundaki Boşlukları Kaldırın
        String trimmedText = text.trim();
        System.out.println("Boşluklar kaldırıldı: '" + trimmedText + "'");

        // 25. Kullanıcının Girdiği Metindeki Belirli Bir Karakteri Değiştirin
        System.out.print("Değiştirmek istediğiniz karakteri girin: ");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.print("Yeni karakteri girin: ");
        char newChar = scanner.nextLine().charAt(0);
        String replacedCharText = text.replace(oldChar, newChar);
        System.out.println("'" + oldChar + "' karakteri '" + newChar + "' ile değiştirildi: " + replacedCharText);

        // 26. Metindeki Belirli Bir Karakter Dizisinin Yerini Bulun
        System.out.print("Bir karakter dizisi girin (yerini bulmak için): ");
        String subString = scanner.nextLine();
        int subStringIndex = text.indexOf(subString);
        if (subStringIndex != -1) {
            System.out.println("'" + subString + "' kelimesinin geçtiği yer: " + subStringIndex);
        } else {
            System.out.println("'" + subString + "' kelimesi metinde bulunamadı.");
        }

        // 27. Metindeki İlk ve Son Kelimeyi Bulun
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        System.out.println("İlk kelime: " + firstWord + ", Son kelime: " + lastWord);

        // 28. Bir Metinde Belirli Bir Kelimenin Başladığı ve Bittiği İndeksi Bulun
        System.out.print("Bir kelime girin (indekslerini bulmak için): ");
        String searchSubWord = scanner.nextLine();
        int startIndex = text.indexOf(searchSubWord);
        int endIndex = startIndex + searchSubWord.length() - 1;
        if (startIndex != -1) {
            System.out.println("'" + searchSubWord + "' kelimesi " + startIndex + ". indekste başlıyor ve " + endIndex + ". indekste bitiyor.");
        } else {
            System.out.println("'" + searchSubWord + "' kelimesi metinde bulunamadı.");
        }

        // 29. Kullanıcının Girdiği Metindeki Tüm Rakamları Kaldırın
        String textWithoutNumbers = text.replaceAll("\\d", "");
        System.out.println("Rakamlar kaldırıldı: " + textWithoutNumbers);

        scanner.close();
    }
}
