package chessboardAndQueens;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);

    public static void main(String[] args) {
        new Solution().run();
    }

    String[] board = new String[8];
    boolean[] leftDiagonal = new boolean[15], rightDiagonal = new boolean[15], column = new boolean[8];
    int solutionCount = 0;

    public void run() {
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < 8; row++) {
            board[row] = in.nextLine();
        }
        in.close();
        solve(0);
        printer.print(solutionCount);
    }

    private void solve(int row) {
        if (row == 8) {
            solutionCount++;
            return;
        }
        for (int col = 0; col < 8; col++) {
            if (board[col].charAt(row) == '.'
                    && !leftDiagonal[col - row + 7]
                    && !rightDiagonal[row + col]
                    && !this.column[col]
            ) {
                leftDiagonal[col - row + 7] = true;
                rightDiagonal[col + row] = true;
                this.column[col] = true;
                solve(row + 1);
                leftDiagonal[col - row + 7] = false;
                rightDiagonal[col + row] = false;
                this.column[col] = false;
            }
        }
    }
}