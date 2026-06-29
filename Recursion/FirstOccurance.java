package Recursion;

public class FirstOccurance {
    public static int firstO(int nums[], int i, int n){
        if(i == nums.length){
            return -1;
        }
        if(nums[i] == n){
            return i;
        }
        return firstO(nums, i+1, n);
    }
    public static void main(String[] args) {
        int nums[] = {0,1,8,1,4,5,7,3,9,5,8,8};
        System.out.println(firstO(nums, 0, 8));
    }
}
