package twoSets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(in.readLine());
            solve(n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void solve(int n) {
        int number = n;

        StringBuilder firstArr = new StringBuilder(), secondArr = new StringBuilder();
        long firstMax = 0, secondMax = 0;
        number++;
        while (--number > 0) {
            if (firstMax == 0 || firstMax < secondMax) {
                firstArr.append(number).append(" ");
                firstMax += number;
            } else {
                secondArr.append(number).append(" ");
                secondMax += number;
            }
        }
        if (firstMax != secondMax) {
            printer.print("NO");
            return;
        }
        printer.println("YES");
        printer.println(firstArr.toString().split(" ").length);
        printer.println(firstArr.toString().trim());

        printer.println();
        printer.println(secondArr.toString().split(" ").length);
        printer.println(secondArr.toString().trim());
    }
}
