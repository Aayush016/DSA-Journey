// import java.util.*;

public class Largest_Num {

    public static int Largest(int nums[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 6, 3, 5};
        int num = Largest(nums);
        System.out.println("The largest number in the array is: " + num);
    }
}
