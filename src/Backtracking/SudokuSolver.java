package Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if(solve(board)){
            printBoard(board);
        }else{
            System.out.println("No solution");
        }

    }

    static boolean solve(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char number = '1'; number <= '9'; number++) {
                        if(checkValidity(board, i, j, number)){
                            board[i][j] = number;

                            if(solve(board)){
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkValidity(char[][] board, int rows, int cols, char number) {
        for (int i = 0; i < 9; i++) {
            if(board[i][cols] == number) {
                return false;
            }
            if(board[rows][i] == number) {
                return false;
            }

            int rowBox= 3*(rows/3) + i/3;
            int colBox = 3*(cols/3) + i%3;

            if(board[rowBox][colBox] == number) {
                return false;
            }
        }

        return true;
    }

    static void printBoard(char[][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
