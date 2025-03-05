interface Vehicle{
    default void print(){
        if(isValid()){
            System.out.println("Vehicle printed");
        }
    }
    static boolean isValid(){
        System.out.println("Vehicle is valid");
        return true;
    }
    void showLog();
}
public class Car implements Vehicle{

    @Override
    public void showLog() {
        print();
        Vehicle.isValid();
    }
}
/*
IoC là nguyên tắc thiết ke ma trong do control quyen kiem soat viec tao
va quan ly cac doi tuong) duoc dao nguoc tu phia lap trinh vien sang framework(spring)
giai thich dòng:
+ private final UserRepository userRepository.
userRepository la mot dependency(phu thuoc) cua UserService.
final giup dam bao no chi duoc khoi tao mot lan duy nhat trong constructor.
neu co constructor tương ứng, thi day chinh là constructor injection của spring

 */