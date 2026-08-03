public class Reverse{

    public static void rev_Arr(int nums[]){
        int start = 0, end = nums.length - 1;
        while(start < end){
            int temp = 0;
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String args[]){
        int nums[] = {9,8,7,6,5,4,3,2,1,0};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("Reverse of the array: ");
        rev_Arr(nums);
    }
}