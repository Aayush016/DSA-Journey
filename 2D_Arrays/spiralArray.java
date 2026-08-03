public class spiralArray {

    public static void print_SA(int nums[][]){
        int startRow = 0;
        int endRow = nums.length-1;
        int startCol = 0;
        int endCol = nums[0].length-1;

        while(startRow <= endRow && startCol <= endCol){

            // TOP
            for(int i=startCol; i<=endCol;i++){
                System.out.print(nums[startRow][i] + " ");
            }

            // RIGHT
            for(int i=startRow+1; i<=endRow;i++){
                System.out.print(nums[i][endCol] + " ");
            }

            // BOTTOM
            for(int i=endCol-1; i>=startCol; i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(nums[endRow][i] + " ");
            }

            // LEFT
            for(int i=endRow-1; i>startRow;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(nums[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String args[]){
        int nums[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int nums2[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10}
        };

        print_SA(nums);
        System.out.println();
        print_SA(nums2);
    }
}
