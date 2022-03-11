package twoKnights;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        solve(n);
    }

    private void solve(int n) {
        for (int i = 1; i <= n; i++) {
            long possibleArrangements = (long) i * i * (((long) i * i) - 1) / 2;
            long possibleAttackingmoves = (long) 4 * (i - 1) * (i - 2);
            printer.println(possibleArrangements - possibleAttackingmoves);
        }
    }
}
