package towerOfHanoi;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);
    private int count = 0;
    private final StringBuilder steps = new StringBuilder();

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        solve(n, '1', '3', '2');
        printer.print(count);
        printer.print(steps);
    }

    private void solve(int n, char from, char to, char aux) {
        if (n == 0) {
            return;
        }
        count++;
        solve(n - 1, from, aux, to);
        steps.append("\n").append(from).append(" ").append(to);
        solve(n - 1, aux, to, from);
    }
}