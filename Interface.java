interface A{
    int age=44; //final and static
    String area = "Mumbai";
    void show();
    void config();
}
interface X{
    void run();
}

interface Y extends X{
}
class B implements A,X{
    int age;
    public void show(){}
    public void config(){}
    public void run(){}
}
public class Interface {
    public static void main(String a[]){
        B obj = new B();
        obj.show();
        obj.config();
        obj.age = 123;
        System.out.println(A.age + " "+ A.area);
    }
}
