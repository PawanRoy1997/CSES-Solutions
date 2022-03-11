package bitStrings;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run(){
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        in.close();
        solve(n);
    }

    private void solve(Integer n) {
        long result = 1;
        while(n-->0){
            result = (result*2)%1000000007;
        }
        printer.print(result);
    }
}
