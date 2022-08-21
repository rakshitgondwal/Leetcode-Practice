public class Nqueens2 {
    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }

    public static int totalNQueens(int n){
        boolean [][] board = new boolean[n][n];
        return findAns(board,0);
    }
     static int findAns(boolean [][] board,int row){
        if (row == board.length){
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length ; col++) {
            if (check(board,row,col)){
                board[row][col] = true;
                count+= findAns(board,row+1);
                board[row][col] = false;
            }

        }
        return count;
    }
    private static boolean check(boolean [][] board,int row,int col){
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        int leftSide = Math.min(row,col);
        for (int i = 1; i <= leftSide; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }

        int rightSide = Math.min(row, board.length-col-1);
        for (int i = 1; i <= rightSide ; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

}

//    public static int totalNQueens(int n){
//        boolean [][] board = new boolean[n][n];
//        return queens(board,0);
//    }
//    static int queens(boolean[][] board, int row) {
//        if (row == board.length) {
//            return 1;
//        }
//
//        int count = 0;
//
//        // placing the queen and checking for every row and col
//        for (int col = 0; col < board.length; col++) {
//            // place the queen if it is safe
//            if(isSafe(board, row, col)) {
//                board[row][col] = true;
//                count += queens(board, row + 1);
//                board[row][col] = false;
//            }
//        }
//
//        return count;
//    }
//
//    private static boolean isSafe(boolean[][] board, int row, int col) {
//        // check vertical row
//        for (int i = 0; i < row; i++) {
//            if (board[i][col]) {
//                return false;
//            }
//        }
//
//        // diagonal left
//        int maxLeft = Math.min(row, col);
//        for (int i = 1; i <= maxLeft; i++) {
//            if(board[row-i][col-i]) {
//                return false;
//            }
//        }
//
//        // diagonal right
//        int maxRight = Math.min(row, board.length - col - 1);
//        for (int i = 1; i <= maxRight; i++) {
//            if(board[row-i][col+i]) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}
