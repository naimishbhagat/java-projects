enum Laptop{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);
    
    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
public class EnumClass {
    public static void main(String a[]){
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());
                
        for(Laptop laps : Laptop.values()){
            System.out.println(laps + " : " + laps.getPrice());
        }
        

    }
}
