// import java.util.*;

public class Arr_Intro {
    public static void main(String args[]) {
        System.out.println("Hello World");
        
        // Creation
        // Method - 1
        int arr[] = new int[10];

        // Method - 2
        // int numbers[] = {1,2,3};

        // Examples ->
        // String fruits[] = {"Apple", "Mango", "Banana"};

        
        // Input
        // Scanner sc = new Scanner(System.in);
        // arr[0] = sc.nextInt();
        // arr[1] = sc.nextInt();
        // arr[2] = sc.nextInt();
        // System.out.println("Marks: ");
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        arr[2] = 99;
        System.out.println("Marks at index 2 is: " + arr[2]);
        // arr[11] = 12;
        // System.out.println(arr[11]);

        System.out.println("Length of the array is: " + arr.length);

    }
}