public class oddEven{

    public static void odd_Even(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Given number is Even");
        } else {
            System.out.println("Given number is Odd");
        }
    }
    public static void main(String[] args) {
        odd_Even(3);
        odd_Even(12);
        odd_Even(13);
        odd_Even(2);
    }
}