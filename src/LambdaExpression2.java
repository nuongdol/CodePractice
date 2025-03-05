import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Sayable1{
    public String say();
}
@FunctionalInterface
interface Cat{
    public String catTalk();
}
public class LambdaExpression2 {
    /*
    so luong tham so cua bieu thuc lambda phu thuoc vao so luong tham so cua
    phuong thuc truu tuong cua functional interface.
     */
    public static void main(String[] args){
        Sayable1 sayable1 = () ->{
            return "I have nothing to say.";
        };
        System.out.println(sayable1.say());
        Cat cat = ()->{
            return "Meo meo";
        };
        System.out.println(cat.catTalk());
        List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "JavaScript");
        languages.forEach(System.out :: println);
    }
}
