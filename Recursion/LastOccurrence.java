package Recursion;

public class LastOccurrence {
    public static int lastO(int nums[], int i, int n){
        if(i == nums.length){
            return -1;
        }
        int isFound = lastO(nums, i+1, n);
        if(isFound == -1 && nums[i] == n){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,8,1,4,5,7,3,9,5,8,8};
        System.out.println(lastO(nums, 0, 8));
        // System.out.println(firstO(nums, 0, 8));
    }
}
