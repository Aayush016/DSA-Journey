package Recursion;

public class Fibonacci {

    public static int fibN(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibN(n-1) + fibN(n-2);
    }
    public static void main(String[] args) {
        System.out.println("I need to make a Portfolio page");
        System.out.println(fibN(9));
    }
}
