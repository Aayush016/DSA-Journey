public class Linear_Search{

    public static int Linear_S(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void Linear_String(String menu[], String item){
        for (int i = 0; i < menu.length; i++) {
            if(menu[i] == item){
                System.out.println("Item found at Index: " + i);
            }
        }
    }
    public static void main(String args[]) {
        // int numbers[] = {2,4,6,8,10,12,14,16};
        // int key = 10;

        String menu[] = {"Dosa", "Idly", "Sambar", "Poori"};
        String item = "Poori";

        // System.out.println("The index of the key is: " + Linear_S(numbers, key));
        Linear_String(menu, item);
    }
}