//If more than 2 methods in interface then it is normal interface 
//If only 1 method in interface then it is Functional interface (SAM - Single Abstract Method Interface)
//If no method in interface is called marker interface used for Serialise, deserialise objects

@FunctionalInterface
interface A{
    void show();
    //void run(); // it will give error
}

class B implements A{
    public void show(){
        System.out.println("In show");
    }
}
public class InterfacTypes {
    public static void main(String a[]){
        B obj = new B();
        obj.show();
    }
}
