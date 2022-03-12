package coinPiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Solution {
    private final PrintStream printStream = new PrintStream(System.out);

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(in.readLine());
            while (n-- > 0) {
                String[] counts = in.readLine().split(" ");
                long firstPileCount = Long.parseLong(counts[0]);
                long secondPileCount = Long.parseLong(counts[1]);
                solve(firstPileCount, secondPileCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void solve(long first, long second) {
        if (first > 2 * second || second > 2 * first || (first + second) % 3 != 0) {
            printStream.println("NO");
        }else{
            printStream.println("YES");
        }
    }
}
