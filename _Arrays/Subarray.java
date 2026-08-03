public class Subarray{

    public static void subArray(int nums[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(nums[k] + " ");
                    sum += nums[k];
                }
                if(largest < sum){
                    largest = sum;
                }
                if(smallest > sum){
                    smallest = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
    public static void main(String args[]){
        int nums[] = {1, -2, 6, -1, 3};
        subArray(nums);
    }
}