public class DesignPatternTest {
    /*
    khai niem:
    la mot trong nhóm Creational, nó sẽ đảm bảo duy nhất 1 thể hiện được tạo, hay còn có
    thể giải thích là xuyên suốt quá trình hoạt động của ứng dụng chỉ có duy nhất một đối tượng
    được tạo ra từ một class.
    Được sử dụng trong những TH:
    - Đảm bảo chỉ có một thể hiện(instance) duy nhất của một class.
    - Có thể quản lý số lượng thể hiện của một lớp trong giới hạn ta muốn.
    Nguyên tắc để tạo lên một Singleton
    - Hàm tạo hay còn gọi là constructor có thể truy cập với private tức chỉ có thể truy xuất trong nội bộ của class.
    - Thể hiện của nó được đặt dạng ' private static final variable' để đảm bảo biến chỉ được khởi tạo trong class.
    - có một method 'public static' để trả về thể hiện được đề cập bên trên.
    Có những cách tạo ra Singleton theo từng trường hợp sử dụng
    - Trên thực tế chúng ta có rất nhiều cách để tạo ra một Singleton tuy nhiên mình sẽ chỉ giới thiệu những mẫu chính và thường gặp.
    - Gồm 4 trường hợp sau : Eager initialization, Lazy Initialization, Thread Safe, Double Check Locking.
    - Trên đây là lý thuyết sơ bộ về singleton và những trường hợp trên mình sẽ đề cập trong video trên kênh của mình mong các bạn sẽ quan tâm.
     */
    //EagerInitialization
    public static void main(String[] args) {
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("Nuong");
        System.out.println(eager1.getName());
        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println(eager2.getName());

    }


}

class EagerInitialization{
    private static final EagerInitialization INSTANCE =  new EagerInitialization();
    private EagerInitialization(){

    }
    public static EagerInitialization getInstance(){
        return INSTANCE;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/*
design pattern: mẫu có sẵn. thiết kế sẵn cho chúng ta. Áp dụng de toi uu code, hướng tới
lập trình hướng đối tượng OOP
nên sử dụng:
+ tái sử dụng code va de dang mở rộng
+ là những giải pháp đã được tối ưu hoá và chúng ta có th sử dụng tuỳ theo trường hop
mà không cần suy nghĩ.
+ đồng thời tăng tốc độ phát triển và testing cho các nhà phát triển.
+ code sẽ trở nên dễ đọc và dễ hiểu kèm theo đó là dễ bảo trì nâng cấp về sau.
+ tiết kiệm thời gian làm việc với code của các dev khác.
*************************************************************
1. Creational Patterns(nhóm khởi tạo)
bao gồm 5 mẫu: Factory Method, Abstract Factory, Builder, Prototype, Singleton.
cung cấp giải pháp giúp tạo ra object và che giấu logic tạo ra nó thay vì tạo một cách trực tiếp => giúp chương trình
mềm dẻo hơn khi muốn tạo object nào và theo tình huống nào.
2. Structural patterns(nhóm cấu trúc)
bao gồm 7 mẫu: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
giup ta thiết lập mối quan he giữa các đối tượng với nhau.
3. Behavioral patterns (nhóm tương tác)
bao gồm 11 mẫu: Interpreter, Template Method, Chain of Responsibility, Command, Iterator, Mediator, Memento, Observer,
State, Strategy và Visitor.
cung cap giai phap de thuc hien cac hanh vi cua đối tượng cũng nhu giữa các object với nhau.
 */