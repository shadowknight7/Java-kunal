package backtracking;

public class Sudoku_solver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }
    static boolean solve(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
         boolean emptyleft=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j]==0) {
                    row = i;
                    col = j;
                    emptyleft = false;
                    break;
                }

            }
            if (emptyleft == false) {
                break;
            }
        }
            if(emptyleft==true){
                return true;
            }
            // backtrack
            for (int number=1; number <=9 ; number++) {
                if (issafe(board,row,col,number)){
                    board[row][col]=number;
                    if(solve(board)){
                        return true;
                    }
                    else{
                        board[row][col]=0;
                    }
                }
                
            }
            return false;


    }
    static boolean issafe(int[][] board,int row,int col,int  number){
        for(int i=0;i<board.length;i++){
            if(board[row][i]==number){
                return false;
            }
        }
        for(int[] rows :board){
            if(rows[col]==number){
                return false;
            }
        }
        int sqrt =(int)(Math.sqrt(board.length));
        int rowstart = row -row%sqrt;
        int colstart= col-col%sqrt;
        for (int i = rowstart; i < rowstart+sqrt ; i++) {
            for (int j = colstart; j <colstart+sqrt ; j++) {
                if(board[i][j]==number){
                    return false;
                }

            }

        }
        return true;
    }
    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
