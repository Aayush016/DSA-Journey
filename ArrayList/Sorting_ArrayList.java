import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ArrayList {
    public static void main(String[] args) {
        // Collections.sort(list); => Ascending Order
        // Collections.sort(list, collections.reverseOrder()); => Descending Order

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);

        // Ascending Order
        Collections.sort(list);
        System.out.println(list);

        // Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
