public class clearIthBit {

    public static int clear_IthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit) {
    n = clear_IthBit(n, i);
    int BitMask = newBit << i;
    return n | BitMask;
}

    public static void main(String[] args) {
        // int n = 10;
        // System.out.println(clear_IthBit(n, 1));
        System.out.println(updateIthBit(10, 2, 1));
    }
}
