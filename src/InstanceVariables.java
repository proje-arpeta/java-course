public class InstanceVariables {
    public int instanceVar;

    public  InstanceVariables(int number){
        this.instanceVar = number;
    }
    public void display(){
        System.out.println((instanceVar));
    }
    public static void main(String[] args) {
        InstanceVariables example1 = new InstanceVariables(10);
        InstanceVariables example2 = new InstanceVariables(30);
        example1.display();
        example2.display();
    }
}
