class Human{
    private int age;
    private String name;

    public Human(){
        age = 12;
        name = "John";
    }
    
    public Human(int a, String n){
        this.age = a;
        this.name = n;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String a[]){
        Human obj = new Human();
        Human obj1 = new Human(20,"Naimish");
        // obj.setAge(11); ;
        // obj.setName("Naimish");

        System.out.println(obj.getAge()+ " "+obj.getName());
        System.out.println(obj1.getAge()+ " "+obj1.getName());
    }
}
