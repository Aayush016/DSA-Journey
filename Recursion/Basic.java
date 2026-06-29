package Recursion;

public class Basic {


    // Print N to 1 in Decreasing Order
    public static void printN(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printN(n-1);
    }

    // Print N to 1 in Increasing order
    public static void printAscending(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printAscending(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println("We're Back Baby!");
        // printN(5);
        printAscending(5);
    }
}
