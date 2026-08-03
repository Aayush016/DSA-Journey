public class PrefixSumSubArr {

    public static void MaxSubArraySum(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        // Calculate Prefix Array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }


        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max sum: " + maxSum);
    }
    public static void main(String args[]){
        int nums[] = {1, -2, 6, -1, 3};
        MaxSubArraySum(nums);
    }
}
