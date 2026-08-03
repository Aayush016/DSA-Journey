import java.util.Arrays;

public class insertionSort {

    public static void insertion_Sort(int nums[]){
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i-1;
            // Finding correct position to insert
            while(prev >= 0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            // Insertion
            nums[prev+1] = curr;
        }
    }
    public static void printArr(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int nums[] = {5,4,1,3,2};
        // insertion_Sort(nums);
        printArr(nums);
        Arrays.sort(nums);
        printArr(nums);
    }
}
