// ----------------------- Assignment Problems -----------------------

/*
Q1. For a given integer array of size N. You have to find all the occurrences
(indices) of a given element (Key) and print them. Use a recursive function to solve this
problem.

Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
Sample Output : 1 5 7 8

Question 2 :
You are given a number (eg - 2019), convert it into a String of english like
"two zero one nine". Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
can't be 0.


Sample Output : "one nine four seven"
Sample Input : 1947
*/

public class Practice_Questions {

    public static void print_Occurrences(int arr[], int idx, int key){
        // Base case
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == key){
            System.out.print(idx + " ");
        }

        print_Occurrences(arr, idx+1, key);
    }
    public static void main(String args[]){
        System.out.println("----------------------- Hello World -----------------------");
        int arr[] = {3,2,4,5,6,2,7,2,2};
        print_Occurrences(arr, 0, 2);
    }
}
