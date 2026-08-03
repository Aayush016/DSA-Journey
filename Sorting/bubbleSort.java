public class bubbleSort{

    public static void bubble_Sort(int nums[]){
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            // int swaps = 0;
            for(int j = 0; j <= n-2-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    // swaps++;
                }
            }
            // System.out.println(swaps);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int nums[] = {5,4,1,3,2};
        System.out.println("Before sorting: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        System.out.println("After sorting: ");
        bubble_Sort(nums);
    }
}