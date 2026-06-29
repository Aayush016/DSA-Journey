package Recursion;

public class XpowN {

    public static int powX_N(int x, int n){
        if(n == 0){
            return 1;
        }

        return x * powX_N(x, n-1);
    }

    // Optimized X^N
    public static int optimizedPow(int x, int n){
        if(n == 0){
            return 1;
        }

        int half = optimizedPow(x, n/2);
        int full = half * half;
        if(n%2 != 0){
            full = x * full;
        }
        return full;
    }
    public static void main(String[] args) {
        // System.out.println(powX_N(2, 10));
        System.out.println(optimizedPow(2, 9));
    }
}
