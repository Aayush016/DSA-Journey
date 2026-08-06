import java.util.ArrayList;
public class Basics{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Operations: 1. Add || 2. Get || 3. Remove || 4. Set || 5. Contains
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Get Operation
        // int element = list.get(2);
        // System.out.println(element);

        // Remove Operation
        // list.remove(2);
        // System.out.println(list);

        // Set Element at Index
        // list.set(2,10);
        // System.out.println(list);

        // Contains Element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // Add at index
        list.add(1, 9);
        System.out.println(list);

        // Size of ArrayList
        System.out.println(list.size());

        // Iteration over ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}