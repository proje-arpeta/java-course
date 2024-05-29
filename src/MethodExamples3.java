public class MethodExamples3 {

    public void message(){
        System.out.println("Merhaba");
    }
    public int add(int a , int b){
        return a+b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return  a + b + c;
    }
    public static int mutiply(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        MethodExamples3 example = new MethodExamples3();
        MethodExamples2 example2 = new MethodExamples2();
        int rsultMultiply = mutiply(10 , 20);
        int calc = example2.calculator(1,2, "+");
        double result =  example.add(10.4, 20.9);
        int rsultInt = example.add(20,30);
        int result3 = example.add(10,20,30);

        int price = 100;

    }


}
