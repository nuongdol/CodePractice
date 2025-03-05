import java.util.function.Consumer;

public class ConsumerTest {
    /*
    chi co mot pt truu tuong
    khong tra ve ket qua (tra ve void)
    thuong dung khi can thuc hien 1 hanh dong voi du lieu dau vao(in ra man hinh, ghi log, cap nhat trang thai)
     */
    public static void main(String[] args){
        //consumer in ra chuoi
        Consumer<String> printConsumer = message -> System.out.println("Test consumer." + message);
        printConsumer.accept("Hello world with you and happy of day.");//goi pt de thuc hien hanh dong

    }
}
