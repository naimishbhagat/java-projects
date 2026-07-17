enum Status{
    Running, Failed,Pending, Success;
}
public class Enums {
    public static void main(String a[]){
        int i =5;
        Status s = Status.Running;
        Status[] ss = Status.values();
        for(Status st: ss){
             System.out.println(st + " : " + st.ordinal());
        }

        if(s == Status.Running)
            System.out.println("All good");
        else if(s == Status.Failed)
            System.out.println("Try again");
        else if(s == Status.Pending)
            System.out.println("Please wait");
        else
            System.out.println("Done");
       

        switch(s){
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Success:
                System.out.println("Please wait");
                break;
                
        }
    }
    
}
