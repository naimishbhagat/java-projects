class NaimishException extends Exception{
    public NaimishException(String str){
        super(str);
    }

}
public class CustomException {
    public static void main(String a[]){
         int i = 0;
        int j = 2;
        try{
            int res = i/j;
            if(j==0)
                throw new NaimishException("Arithmetic Exception");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic operation"+e);
        }catch(NaimishException e){
            System.out.println("Naimish Exception"+e);
        }catch(Exception e){
            System.out.println("Something went wrong"+e);
        }
    }
}
