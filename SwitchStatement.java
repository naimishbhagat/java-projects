public class SwitchStatement {
    public static void main(String[] args){
        int n = 2;
        String result="";
        switch(n){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
        }
        System.out.println(result);
    }
}
