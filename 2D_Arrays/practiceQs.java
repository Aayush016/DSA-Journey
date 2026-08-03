public class practiceQs{

    public static int findKeyCount(int nums[][], int key){
        int count = 0;
        for(int i=0; i<nums.length;i++){
            for(int j=0; j<nums[0].length;j++){
                if(nums[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }

    public static void printTranspose(int nums[][]){
        int row = nums.length;
        int col = nums[0].length;
        int[][] transpose = new int[col][row];
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                transpose[j][i] = nums[i][j];
            }
        }

        for(int i=0; i<col;i++){
            for(int j=0; j<row;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int nums[][] = {{1,2,3}, {4,5,6}};
        int key = 8;
        System.out.println(nums.length + " " + nums[0].length);

        // 1. Count number of keys
        System.out.println(findKeyCount(nums, key));

        // 2. Print 2nd Row
        for(int j=0; j<nums[0].length;j++){
            System.out.print(nums[1][j] + " ");
        }
        System.out.println();

        // 3. TRANSPOSE
        printTranspose(nums);
    }
}