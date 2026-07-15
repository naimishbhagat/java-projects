class Computer {
    public void playMusic(){
        System.out.println("Music Playing");
    }

    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Pen";
        
        return "Nothing";
    }
}
public class Methods {
    public static void main(String[] a){
        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.getMeAPen(100));
    }
}
