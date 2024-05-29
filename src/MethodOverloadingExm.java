public class MethodOverloadingExm {
    public  int add(int a , int b){
        return  a + b;
    }
    public int add(int a, int b, int c){
        return  a + b + c;
    }
    public  double add(double a, double b){
        return  a + b;
    }
    public  double add(double a, double b, double c){
        return  a + b + c;
    }
    public  double addDouble(double a, double b){
        return  a + b;
    }

    public static int multiply(int a ,int  b ){
        return a * b;
    }

    public static void main(String[] args) {
        MethodOverloadingExm project = new MethodOverloadingExm();
       int mResult =  multiply(1,4);
       System.out.println("Multiply" + mResult);
       int resultInt =  project.add(10,20);
       double resultDouble = project.addDouble(10.4, 20.7);
       System.out.println("resltDouble " + resultDouble);
       double resultDouble2 = project.add(10.7, 23.9);
        System.out.println("resltDouble 2 " + resultDouble2);
        int result2 = project.add(1,2,4);
    }


}
