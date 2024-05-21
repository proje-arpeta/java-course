public class StaticVariables {
    static int staticVar;

    public StaticVariables(int value){
        staticVar = value;
    }
    public  void display(){
        System.out.println(staticVar);
    }

    public static void main(String[] args) {
        StaticVariables example = new StaticVariables(230);
        example.display();
    }
}
