abstract class Car{
    public abstract void drive();
    public abstract void fly();
    
    public void playMusic(){
        System.out.println("Play music");
    }
}
class Toyota extends Car{
    public void fly(){
        System.out.println("Flying ...");
    }
    public void drive(){
        System.out.println("Driving ...");
    }
}
public class AbstactKeyword {
    public static void main(String a[]){
        Car obj = new Toyota();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
