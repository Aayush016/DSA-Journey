public class getIthBit{

    public static int get_Ith_Bit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(get_Ith_Bit(10, 3));

    }
}