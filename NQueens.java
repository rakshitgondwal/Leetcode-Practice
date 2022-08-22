import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] ='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        findAns(ans,board,0);
        return ans;
    }

    public static void findAns(List<List<String>> ans,char[][] board,int row){
        if (row == board.length){
            ans.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length ; col++) {
            if (check(board,row,col)){
                board[row][col] = 'Q';
                findAns(ans,board,row+1);
                board[row][col] = '.';
            }

        }
        return;
    }

    private static boolean check(char[][] board,int row,int col){
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        int leftSide = Math.min(row,col);
        for (int i = 1; i <= leftSide; i++) {
            if (board[row-i][col-i] == 'Q'){
                return false;
            }
        }

        int rightSide = Math.min(row, board.length-col-1);
        for (int i = 1; i <= rightSide ; i++) {
            if (board[row-i][col+i] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
