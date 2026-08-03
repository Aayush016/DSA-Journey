public class LinearSearch{

    public static int Linear_S(int nums[], int key){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println("Hello World!");
        int nums[] = {4,6,1,10,11,2,19};
        int key = 10;
        System.out.println(Linear_S(nums, key));
    }
}