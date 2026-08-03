// Print all binary strings of size N without consecutive ones.

// Base case:
// if n = 0 -> Empty string
//    n = 1 -> 1, 0
//    n = 2 -> 00, 01, 10
// For n = 0 print an empty string

// Work:
// lastplace value is sent in the recursion.

public class Binary_Strings_Problem {
    public static void printBinaryStrings(int n, int lastPlace, String str){
        // Base Case
        if(n==0) {
            System.out.println(str);
            return;
        }

        // Work
        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinaryStrings(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
}
