import java.util.*;

class Solution {

    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        boolean[] cols = new boolean[n];           // columns
        boolean[] diag1 = new boolean[2 * n - 1];  // left diagonal (r - c + n-1)
        boolean[] diag2 = new boolean[2 * n - 1];  // right diagonal (r + c)

        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');

        backtrack(0, n, board, cols, diag1, diag2);
        return result;
    }

    private void backtrack(int row, int n, char[][] board,
                           boolean[] cols, boolean[] diag1, boolean[] diag2) {

        // store answer
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board)
                temp.add(new String(r));
            result.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {

            int d1 = row - col + (n - 1);
            int d2 = row + col;

            // check 
            if (cols[col] || diag1[d1] || diag2[d2])
                continue;

            // place queen
            board[row][col] = 'Q';
            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;

            // move to next row
            backtrack(row + 1, n, board, cols, diag1, diag2);

            // remove queen (backtrack)
            board[row][col] = '.';
            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }
}

