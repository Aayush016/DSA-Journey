public class TrappedWater{

    public static int Trapped_Water(int heights[]){
        int n = heights.length;
        int T_Water = 0;
        // LeftMax - Auxiliary Arrays
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i-1]);
            System.out.print(leftMax[i]);
        }
        System.out.println();

        // RightMax - Auxiliary Arrays
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
            System.out.print(rightMax[i]);
        }
        System.out.println();
        //Loop
        for (int i = 0; i < n; i++) {

            // Water level => MIN(LeftMax, RightMax)
            int waterLvl = Math.min(leftMax[i], rightMax[i]);

            //TrappedWater = water level - heights[i]
            T_Water += waterLvl - heights[i];
        }
        return T_Water;
    }
    public static void main(String args[]){
        int heights[] = {8,4,7,6,3,5,9,8};
        System.out.println(Trapped_Water(heights));
    }
}