import java.util.*;

public class SortedListExample {
    public static final List<Integer> NUMBERS = Arrays.asList(5, 1, 2, 4, 3, 6, 7, 9, 8);
    public static void main(String[] args){
        //sorting a list
        List<Integer> list1 = new ArrayList<>(NUMBERS);
        Collections.sort(list1);
        System.out.println(list1);

        //original data
        Set<Integer> set1 = new LinkedHashSet<>(NUMBERS);
        //convert set to list
        List<Integer> list_1 = new ArrayList<>(set1);
        //sorting a list
        set1 = new LinkedHashSet<>(list_1);
        System.out.println(set1);
    }
}
