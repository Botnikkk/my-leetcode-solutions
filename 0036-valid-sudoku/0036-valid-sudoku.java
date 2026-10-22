import java.util.Arrays;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            char[] box = new char[9];

            char[] column = new char[9];
            column[0] = board[0][i];

            char[] row = Arrays.copyOf(board[i], board[i].length);
            Arrays.sort(row);

            for (int j = 1; j < 9; j++) {
                if ((row[j] != '.') && (row[j] == row[j - 1])) {
                    return false;
                }
                column[j] = board[j][i];
            }

            Arrays.sort(column);
            for (int k = 1; k < 9; k++) {
                if ((column[k] != '.') && (column[k] == column[k - 1])) {
                    return false;
                }
            }

            int n = 3 * (i / 3); // 0,0,0,3,3,3,6,6,6
            int m = 3 * (i % 3); // 0,3,6,0,3,6,0,3,6

            int index = 0;
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 3; b++) {
                    box[index] = board[n + a][m + b];
                    index++;
                }
            }

            Arrays.sort(box);
            for (int k = 1; k < 9; k++) {
                if ((box[k] != '.') && (box[k] == box[k - 1])) {
                    return false;
                }
            }
        }
        return true;
    }
}