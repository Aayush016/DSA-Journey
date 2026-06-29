package Recursion;

public class Factorial {

    // Function for Factorial
    public static int factN(int n){
        if(n == 0){
            return 1;
        }
        return n * factN(n-1);
    }
    public static void main(String[] args) {
        System.out.println("What's Up Guys!");
        System.out.println(factN(5));
    }
}
