public class StringBufferDemo {
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer("Naimish");

        sb.append(" Bhagat");
        sb.insert(0, "Java");
        sb.setLength(10);
        System.out.println(sb.toString());
            
        // String name = "Naimish";
        // name = name + " Bhagat";

        // String s1 = "abc";
        // String s2 = "abc";
        // System.out.println(s1 == s2);
        // System.out.println(name);
    }
    
}
