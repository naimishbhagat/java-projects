
public class Inheritance {
    public static void main(String a[]){
        Calc obj = new Calc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(7,3);

        System.out.println(r1);
        System.out.println(r2);

        AdvCalc obj1 = new AdvCalc();
        int r3 = obj1.mul(2,4);
        int r4 = obj1.add(2,4);
        System.out.println(r3);
        System.out.println(r4);

        VeryAdvCalc obj2 = new VeryAdvCalc();
        double r5 = obj2.power(4,5);
        System.out.println(r5);
    }
}
