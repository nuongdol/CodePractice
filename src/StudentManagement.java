import java.util.HashMap;
import java.util.Map;

class Student {
    String name;
    double gpa;
    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return "Name: " + name + ", GPA: " + gpa;
    }
}
public class StudentManagement {
    public static void main(String[] args){
        Map<String, StudentTest> studentMap = new HashMap<>();
    }
}
