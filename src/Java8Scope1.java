/*
functional interface va generic class
 */
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
public class Java8Scope1 {
    public static void doSomething1(){
        final int num = 1;
        Converter<Integer, String> stringConverter = (from -> String.valueOf(from + num));
        System.out.println(stringConverter.convert(2));
    }
    public static void doSomething2(){
        int num = 1;
        Converter<Integer, String> stringConverter = (from -> String.valueOf(from + num));
        System.out.println(stringConverter.convert(2));
    }
    public static void doSomething3(){
        int num = 1;
        Converter<Integer, String> stringConverter = (from -> String.valueOf(from + num));
        System.out.println(stringConverter.convert(2));
    }
    public static void main(String[] args){
        doSomething1();
        doSomething2();
        doSomething3();
    }
}
