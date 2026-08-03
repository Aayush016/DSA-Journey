public class SubArray {

    public static void printSubArray(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int Kadanes(int nums[]){
        int cs = 0, ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];
            ms = Math.max(cs, ms);
            if(cs < 0){
                cs = 0;
            }
        }
        return ms;
    }
    public static void main(String args[]){
        int nums[] = {-2,-4,-6,-8,-10};
        // printSubArray(nums);
        System.out.println(Kadanes(nums));
    }
}
