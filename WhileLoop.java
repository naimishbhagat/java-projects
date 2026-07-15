public class WhileLoop {
    public static void main(String[] args){
        //repeat this statement 4 times
        int i = 0;
        while(i < 5){
            System.out.println("Hi");
            i++;
        }

        //nested while loop

        int k =1;
        while(k<=4){
            System.out.println("Hi " + k);
            int j = 1;
            while(j<=3){
                System.out.println("Hello " + j);
                j++;
            }
            k++;
        }
    }
}
