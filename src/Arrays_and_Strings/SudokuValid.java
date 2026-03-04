package Arrays_and_Strings;

import java.util.HashSet;

public class SudokuValid {
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

        System.out.println(isValid(board));
    }

    public static boolean isValid(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char num = board[i][j];
                if (num == '.') {
                    continue;
                }

                if(!set.add(num+ " in row "+ i) ||
                !set.add(num+ " in column "+ j) ||
                !set.add(num+ " in block "+ i/3+"-"+j/3)) {
                   return false;
                }
            }
        }

        return true;
    }
}
