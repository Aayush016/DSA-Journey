public class TilingProblem {

    public static int tilingProblem(int n) { // 2 x N (Floor size)
        // Base Case
        if(n == 0 || n==1){
            return 1;
        }

        //Kaam
        // Vertical choice:
        int fnm1 = tilingProblem(n-1);

        // Horizontal choice
        int fnm2 = tilingProblem(n-2);

        int total_Ways = fnm1 + fnm2;
        return total_Ways;
    }
    public static void main(String[] args) {
        int n = 4;
        int ways = tilingProblem(n);
        System.out.println(ways);
    }
}


// We have a choice to place our tiles either horizontally or vertically!
// The base case is that: If n=0 or 1 there i only 1 way to place a tile.
// (You place it or you don't)
