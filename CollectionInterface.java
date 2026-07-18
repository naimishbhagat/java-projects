
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionInterface {
    public static void main(String a[]){
        //Collection<Integer> nums = new ArrayList<Integer>();
        //List<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
            System.out.println(values.hasNext());
        // System.out.println(nums.indexOf(2));
        // System.out.println(nums.get(2));
        // for(int n: nums){
        //     System.out.println(n);
        // }
        
    }
}
