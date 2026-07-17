class A{
    public void Show(){
        System.out.println("in A show");
    }
}
class B extends A{
    @Override
    public void Show(){
        System.out.println("in B show");
    }
}
public class Annotation {
    public static void main(String a[]){
        A obj = new B();
        obj.Show();
    }
}
