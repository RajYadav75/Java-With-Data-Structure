package Backtracking;
// Place N queens on an N*N chessboard such that no 2 queens can attack each other
public class NQueens {

    public static boolean isSafe(char[][] board, int row, int col){
        //vertical up
        for (int i = row -1; i>=0; i++){
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal up
        for (int i = row-1, j=col-1; i >=0 && j>=0 ; i--,j--) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonal right up
        for (int i = row-1,j=col+1; i >=0 && j< board.length ; i--,j++) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return false;
    }


    public static void nQueen(char[][] board, int row){
        if (row == board.length){
//            count++;
            printBoard(board);
            return;
        }
        //column loop
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)){
                board[row][i] = 'Q';
                nQueen(board,row+1);
                board[row][i] ='.';
            }
        }
    }
    public static void printBoard(char[][] board){
        System.out.println("----------Chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueen(board,0);
    }
}

