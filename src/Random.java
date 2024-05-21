/*----------------------------------------------------------------------------------------------------------------------
	 Random sınıfının int paremtreli nextInt metodu [0, bound) aralığında rasgele üretilmiş bir sayıya geri döner
-----------------------------------------------------------------------------------------------------------------------*/

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        java.util.Random r = new java.util.Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i)
            System.out.printf("%d ", r.nextInt(100)); //[0,99]

        System.out.println();
    }
}
