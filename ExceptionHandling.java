public class ExceptionHandling {
    public static void main(String a[]){
        int i = 0;
        int j = 2;
        try{
            int res = i/j;
            if(j==0)
                throw new ArithmeticException("Arithmetic Exception");
            String[] st = new String[5];
            System.out.println(st[5]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic operation"+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound operation"+e);
        }catch(NullPointerException e){
            System.out.println("Null pointer Exception"+e);
        }catch(Exception e){
            System.out.println("Something went wrong"+e);
        }

        System.out.println("Bye");
    }
}
