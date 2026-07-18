
import java.util.Scanner;


public class BufferReader {
    public static void main(String a[]){
        System.out.println("Enter a number");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        Scanner sc = new Scanner(System.in);
        try {
            
            int num = sc.nextInt();

            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
