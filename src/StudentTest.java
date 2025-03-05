import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
comparable: mot logic so sanh duy nhat, dung cho sap xep mac dinh
khi ban muon sap xep mac dinh cho mot class
comparator: da dang logic so sanh, linh hoat hon, khong can chinh sua class goc, khi can
sap xep theo nhieu tieu chi khac nhau
 */
public class StudentTest implements Comparable<StudentTest>{
    int id;
    String name;

    public StudentTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(StudentTest other) {
        return Integer.compare(this.id, other.id);
    }
    @Override
    public String toString(){
        return "Student{id=" + id + ", name=" + name + "'}";
    }
    public static void main(String[] args){
        List<StudentTest> studentTests = new ArrayList<>();
        studentTests.add(new StudentTest(3, "John"));
        studentTests.add(new StudentTest(1, "Elsa"));
        studentTests.add(new StudentTest(2, "Nathaly"));
        studentTests.add(new StudentTest(4, "Ricky"));
        studentTests.add(new StudentTest(7, "Alice"));
        studentTests.add(new StudentTest(5, "Bob"));
        Collections.sort(studentTests);//sap xep theo id mac dinh
        System.out.println(studentTests);

        //so sanh theo ten
        studentTests.sort(Comparator.comparing(s->s.name));
        System.out.println("Sort by name: " + studentTests);

        //so sanh theo id
        studentTests.sort(Comparator.comparingInt(s->s.id));
        System.out.println("Sort by id: " + studentTests);

    }
}

