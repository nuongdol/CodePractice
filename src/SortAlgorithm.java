public interface SortAlgorithm {
    public void sort(int array[]);
}
class BubbleSortAlgorithm implements SortAlgorithm{

    @Override
    public void sort(int[] array) {
        // todo add your logic hear
        System.out.println("Da sap xep bang thuat toan sx noi bot");
    }
}
class VeryComplexService{
    private SortAlgorithm sortAlgorithm;
    public VeryComplexService(){
        sortAlgorithm = new BubbleSortAlgorithm();
    }
    public void complexBusiness(int array[]){
        sortAlgorithm.sort(array);
        // todo more logic here
    }
}
// todo với cách là này thì VeryComplexService se chi quan he voi mot interface SortAlgorithm.
// voi cach lam nay thi moi quan he giam bot su lien ket, nhung no khong thay doi duoc viec thuat toan van dang la BubbleSortAlgorithm.