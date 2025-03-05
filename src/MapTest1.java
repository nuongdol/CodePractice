import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
phuong thuc map() trong stream cua java duoc su dung de chuyen doi tung phan tu cua stream thanh
mot gia tri khac. --> su dung khi can bien doi du lieu.
*/

public class MapTest1 {
    public static void main(String[] args){
        //su dung map() voi danh sach don gian
        List<Integer> array_1 = new ArrayList<>();
        array_1.add(1);
        array_1.add(2);
        array_1.add(3);
        array_1.add(4);
        array_1.stream().map(integer -> integer * 2).collect(Collectors.toList());
        array_1.forEach(System.out::println);

        //su dung map() de chuyen doi kieu du lieu
        List<String> string_1 = array_1.stream().map(String::valueOf).collect(Collectors.toList());
        //su dung map voi danh sach doi tuong
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));
        List<String> names = people.stream().map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(names);
        //so sanh map() tra ve mot stream thif ket qua Stream<Stream<T>>--> flatMap() lam phang du lieu.
    }
    static class Person{
        String name;
        int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return name;
        }
    }
}
