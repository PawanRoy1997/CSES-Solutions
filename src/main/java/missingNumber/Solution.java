package missingNumber;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        for (int i = n; i > 1; i--) {
            sum+= in.nextLong();
        }
        in.close();
        solve(n, sum);
    }

    public void solve(int n, long sum) {
        long expectedSum = (long) n*(n+1)/2;
        System.out.print(expectedSum - sum);
    }
}
