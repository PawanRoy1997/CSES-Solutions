package increasingArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long result = 0, current, ans, prev = 0;
        for (int i = n; i > 0; i--) {
            current = in.nextLong();
            if (i == n) {
                prev = current;
            }

            ans = prev - current;
            if (ans > 0) {
                result += ans;
            } else {
                prev = current;
            }
        }

        solve(result);
    }

    public void solve(long result) {
        System.out.print(result);
    }
}
