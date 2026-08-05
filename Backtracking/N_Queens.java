public class N_Queens {

    public static boolean isSafe(char board[][], int row, int col){
        // Vertically Up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Diagonal Left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Diagonal Right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][], int row){
        // Base Case
        if(row == board.length){
            printBoard(board);
            return;
        }

        // Column Loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'X';
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("---------- Chess Board ----------");
        for (int i = 0; i < board.length; i++) {
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        // Initialize
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
    }
}

// They usually ask 3 types in this:
// 1. Print all solutions.
// 2. Solution exists/not. If yes print 1 solution
// 3. Total count of solutions.
