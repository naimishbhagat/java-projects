@FunctionalInterface
interface A{
    int add(int i,int j);
    
}

class B implements A{
    // public void show(int i){
    //     System.out.println("in B show" +i);
    // }

    public int add(int i, int j){
        return i + j;
    }
}

public class LambdaExpression {
    public static void main(String a[]){
        //A obj = int i -> System.out.println("in A show" +i);
        A obj1 = (i, j) -> i * j;
        //obj.show(5);
        int result = obj1.add(4, 5);
        System.out.println(result);
    }
}
