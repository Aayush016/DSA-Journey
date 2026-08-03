public class sortedFind{

    public static void sorted_Find(int nums[][], int key){
        int start = nums.length-1;
        int end = 0;

        while(start >= 0 && end < nums[0].length-1){
            if(nums[start][end] == key){
                System.out.println("Index found!");
                System.out.println("Index is: (" + start + ", " + end + ")");
                return;
            } else if (nums[start][end] < key){
                end++;
            } else {
                start--;
            }
        }
        // System.out.println("Index is: (" + start + ", " + end + ")");
        System.out.println("Index not Found");

    }
    public static void main(String args[]){
        int nums[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,49},
            {32,33,39,50}
        };
        int key = 30;
        sorted_Find(nums, key);
    }
}