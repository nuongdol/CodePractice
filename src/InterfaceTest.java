interface Interface1{
    default void doSomething(){

    }
}
//interface Interface2{
//    default void doSomething(){
//
//    }
//}
class Parent{
    public void doSomething(){
        System.out.println("Execute in Parent.");
    }
}
public class InterfaceTest implements Interface1 {
     /*
    interface gom : public abstract methods, và default method, static method.
    cho phep them cac chuc nang cho interface ma ko lam pha vo cac lop implement tu interface nay.
    mac dinh default method nay la mot pt cua interface cha nen khi cac class khac
    implement interface do thi default method nay co the ko can implement trong cac class khac khi implement class nay.
    chac chi khi nao thuc su can sd thi moi implement.
     */
//    @Override
//    public void doSomething() {
//        Interface1.super.doSomething();
//    }
    public static void main(String[] args){
        InterfaceTest m = new InterfaceTest();
        m.doSomething();
        InterfaceTest m1 = new InterfaceTest();
        m1.doSomething();
    }
}
