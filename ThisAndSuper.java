class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        this();
        System.out.println("In B int");
    }
}
public class ThisAndSuper {
    public static void main(String a[]){
        B obj = new B();
        B obj2 = new B(2);
    }
}
