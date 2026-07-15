public class ConditionalStatement {
 public static void main(String[] args){
        int x1 = 18;
        if(x1 > 10 && x1 <= 20){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
        int x = 8;
        int y = 7;
        int z = 6;

        if(x > y && x > z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);
    
    }
}

