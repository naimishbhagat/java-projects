interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code compile run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code compile run: Faster");
    }
}
class Developer{
    public void devApp(Computer lap){

    }
}
public class NeedOfInterface {
    public static void main(String a[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer n = new Developer();
        n.devApp(desk);
    }
}
