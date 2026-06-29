package Recursion;

public class SumofN {

    public static int sumOfN(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfN(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Hello There!");
        System.out.println(sumOfN(5));
    }
}
