package Recursion;

public class CheckSortedArr {

    public static boolean isSorted(int nums[], int i){
        if(i == nums.length-1){
            return true;
        }
        if(nums[i] > nums[i+1]){
            return false;
        }

        return isSorted(nums, i+1);
    }
    public static void main(String[] args) {
        System.out.println("Don't even think about doing that!");
        int nums[] = {4,5};
        System.out.println(isSorted(nums, 0));
    }
}
