public class KadanesAlgo {

    public static void K_Algo(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int largest = Integer.MIN_VALUE;
        if(allNeg(nums) == true){
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] > largest){
                    largest = nums[i];
                }
            }
            System.out.println("Largest Sum: " + largest);
        } else{
            for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Our maximum Sub-Array Sum: " + ms);
        }
    }

    public static boolean allNeg(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0){
                return false;
            }
        }
        return true;
    }

    // public static void smallestNeg(int nums[]){
    //     int largest = Integer.MIN_VALUE;
    //     if(allNeg(nums) == true){
    //         for (int i = 0; i < nums.length; i++) {
    //             if(nums[i] > largest){
    //                 largest = nums[i];
    //             }
    //         }
    //         System.out.println("Largest Sum: " + largest);
    //     }
    // }
    public static void main(String args[]){
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int nums[] = {-2, -1, -3, -4};
        K_Algo(nums);
        // smallestNeg(nums);
    }
}
