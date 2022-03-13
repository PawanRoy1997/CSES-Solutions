package grayCode;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);

    public void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        solve(n);
    }

    public static void main(String[] args) {
        new Solution().run();
    }

    private void solve(int n) {
        StringBuilder sbo = new StringBuilder(), sbe, sbt;
        int i = n;
        while (i-- > 0) {
            sbo.append("0");
        }
        sbe = new StringBuilder(sbo);
        sbe.setCharAt(n - 1, '1');
        sbo.append("\n").append(sbe);

        for (i = 1; i < n; i++) {
            String[] intermediates = sbo.toString().split("\n");
            for (int y = intermediates.length - 1; y >= 0; y--) {
                sbe = new StringBuilder(intermediates[y]);
                sbe.setCharAt(n - i - 1, '1');
                sbo.append("\n").append(sbe);
            }
        }
        printer.print(sbo);
    }
}
