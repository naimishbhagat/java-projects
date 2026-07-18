import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student [");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append(']');
        return sb.toString();
    }
}
public class ComparatorSort {
    public static void main(String a[]){
        Comparator<Student> com = new Comparator<Student>(){
            public int compare(Student i, Student j){
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Naimish"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Parul"));
        studs.add(new Student(20, "Kiran"));
        
        Collections.sort(studs, com);
        for(Student s: studs)
            System.out.println(s);
    }
}
