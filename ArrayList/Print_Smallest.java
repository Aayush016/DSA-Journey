import java.util.ArrayList;

public class Print_Smallest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(1);

        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            // if(smallest > list.get(i)){
            //     smallest = list.get(i);
            // }

            smallest = Math.min(smallest, list.get(i));
        }

        System.out.println(smallest);
    }
}
