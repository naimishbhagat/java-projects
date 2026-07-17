abstract class A{
    public abstract void show();
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}
public class AbstractInnerClass {
    public static void main(String a[]){
        A obj = new A() {
            public void show(){
                System.out.println("In A show");
            }
        };
        obj.show();
    }
}
