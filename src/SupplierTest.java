
import java.util.function.Supplier;

/*
cung cap mot cai gi do cho chung ta khi can
 */
public class SupplierTest {
    public static void main(String[] args){
        Supplier<String> supplier = () -> "Welcome to gpcoder.com";
        String hello = supplier.get();
        System.out.println(hello);
        Supplier<String> supplier1 = Programing::getDefaultLanguage;
        String defaultLang = supplier1.get();
        System.out.println("Default Language: " + defaultLang);

    }
}
class Programing{
    public String language;
    public int experience;

    public Programing(int experience, String language) {
        this.experience = experience;
        this.language = language;
    }

    public Programing() {
        this.language = "Java";
        this.experience = 5;
    }
    public void print(){
        System.out.println("Language: " + language + " - Experience: " + experience);
    }
    public static String  getDefaultLanguage(){
        return "Java";
    }
}
/*
tri hoãn viec tao ra mot doi tuong cho den khi thuc su can: khi can ket noi den csdl hoac tai mot file lơn ta co the dung supplier de tranh viec ton thoi gian/ tai nguyen neu khong can thiet
cung cap du lieu ma khong can dau vao:supplier ko cần tham so dau vao nao, nhung van co the tra ve du lieu. Điều này rất hữu ích khi ban muốn tạo dữ liệu mot cach dong hoac cac gia tri ngau nhien ma
khong can dau vao: sinh ma OTP ngau nhien, ID dong hoac token trong ung dung

*/