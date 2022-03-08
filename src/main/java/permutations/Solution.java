package permutations;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    private PrintStream out;

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        out = new PrintStream(System.out);
        long input = in.nextLong();
        in.close();
        solve(input);
    }

    public void solve(long n) {
        if(n==1){
            out.print(1);
            return;
        }
        if (n < 4) {
            out.print("NO SOLUTION");
            return;
        }
        if (n == 4) {
            out.print("3 1 4 2");
            return;
        }
        StringBuilder evenPart = new StringBuilder(), oddPart = new StringBuilder();
        for (long i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if(i!=2){
                    evenPart.append(" ");
                }
                evenPart.append(i);
            } else {
                oddPart.append(i).append(" ");
            }
        }

        out.print(oddPart.toString().concat(evenPart.toString()));
    }
}