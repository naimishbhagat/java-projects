class A{
    int age;
    public void show(){
        System.out.println("in A show");
    }
    static class B{
        public void config(){
            System.out.println("In Config");
        }
    }
}

public class InnerClass {
    public static void main(String a[]){
        A obj = new A(){ // Anonymous Inner class
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();

        A.B obj1 = new A.B();
        obj1.config();
    }
}
