package Leetcodepracticeagain;

public class N_queens {
    public static void main(String[] args) {
        int n=5;
        boolean[][] board=new boolean[n][n];
        System.out.println(queen(board,0));

    }
    static int queen(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for (int col = 0; col < board.length; col++) {
            if(issafe(board,row,col)){
                board[row][col]=true;
                count+=queen(board,row+1);

                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        // vertical row
        for (int i =0; i <row ; i++) {
           if (board[i][col]){
               return false;
           }
        }
        int maxleft=Math.min(row,col);
            for (int i = 1; i <=maxleft ; i++) {
                if(board[row-i][col-i]){
                    return false;
                }

            }
        int maxrigth=Math.min(row, board.length-col-1);
        for (int i = 1; i <=maxrigth ; i++) {
            if(board[row-i][col+i]){
                return false;
            }

        }
        return true;

    }

    private static void display(boolean[][] board) {
        for(boolean[] row:board){
           for(boolean element:row) {
               if(element==true){
                   System.out.print('Q');
               }
               else{
                   System.out.print('X');
               }
           }
            System.out.println();
        }
    }

}
