public interface SortAlgorithm2 {
    public void sort(int array[]);
}
class BubbleSortAlgorithm1 implements SortAlgorithm2{

    @Override
    public void sort(int[] array) {
        // todo add your logic here
        System.out.println("Da sap xep bang thuat toan sx noi bot.");
    }
}
class QuicksortAlgorithm implements SortAlgorithm2{

    @Override
    public void sort(int[] array) {
        // todo add your logic here
        System.out.println("Da sap xep bang thuat toan sx nhanh.");
    }
}
class VeryComplexService1{
    private SortAlgorithm2 sortAlgorithmTest;
    public VeryComplexService1(SortAlgorithm2 sortAlgorithm){
        this.sortAlgorithmTest = sortAlgorithm;
    }
    public void complexBusiness(int array[]){
        sortAlgorithmTest.sort(array);
        //todo more logic here
    }
    public static void main(String[] args){
        SortAlgorithm2 bubbleSortAlgorithm = new BubbleSortAlgorithm1();
        SortAlgorithm2 qickSortAlgorithm = new QuicksortAlgorithm();
        VeryComplexService1 business1 = new VeryComplexService1(bubbleSortAlgorithm);
        VeryComplexService1 business2 = new VeryComplexService1(qickSortAlgorithm);
    }
}

//--> can giam thieu su phu thuoc giua cac class
/*
cac class khong nen phu thuoc vao cac ke thua cap thap, ma nen phu thuoc vao abstraction(Lop truu tuong).
dependency injection la viec cac object nen phu thuoc vao cac abstract class va the hien
chi tiet cua no se duoc inject vao doi tuong luc runtime.
inject dependency vao mot doi tuong
+ constructor injection: tiem dependency ngay vao contructor cho tien
+ setter injection:
+ interface injection: moi class muon inject cai gi, thi phai implement mot interface co chua mot ham inject(xx)
+ inversion of control: đảo chiều sự điều khiển: các dependency sẽ được framework ném khi được goi va sự dụng đến.
 */