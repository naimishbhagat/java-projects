class Calculator{
    public int add(int n1, int n2,int n3){
        return n1+n2+n3;
    }

    public int add(int n1, int n2){
        return n1+n2;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String[] a){
        Calculator obj = new Calculator();
        System.out.println(obj.add(4, 5));

    }
}
