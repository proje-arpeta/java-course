public class StaticVariableExample {
    static  int age ;
    public  int count;//instance variable
    static  int count2;
    public StaticVariableExample(int number){
        age = number;
    }

  public void setNumber(int number){
        int localCount = 0; // local değişken
        age = number;
        this.count = this.count + 1;
        count2 = count2 + 2;
        localCount = localCount + 1;
        System.out.println("Local Count:" +localCount);
  }
    public  void  display(){
        System.out.println("Age" + age);
        System.out.println("Count" + this.count);
        System.out.println("Count2" + count2);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World");
        StaticVariableExample example = new StaticVariableExample(10);
        example.setNumber(23);
        example.display();
        example.setNumber(30);
        example.display();
        example.setNumber(43);
        example.display();


    }
}
