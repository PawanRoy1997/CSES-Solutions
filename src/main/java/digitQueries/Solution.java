package digitQueries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);
    private final List<String> queries = new ArrayList<>();

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numOfQueries = Integer.parseInt(in.readLine());
            for (int i = 0; i < numOfQueries; i++)
                queries.add(in.readLine());
            queries.forEach(this::solve);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void solve(String number) {
        long num = Long.parseLong(number);
        if (num < 10) {
            printer.println(num);
            return;
        }
        int c = 1;
        for (long p = 9; ; num -= p, c++, p = 9 * xPowOfTen(c - 1) * c) {
           if(num-p<=0){
               break;
           }
        }
        num--;
        long x=  (num/c);
        int y = (int) (num%c);
        long ans = (xPowOfTen(c-1)+x);
        printer.println(String.valueOf(ans).charAt(y));
    }

    private long xPowOfTen(int times) {
        long res = 1;
        while (--times > -1) {
            res *= 10;
        }
        return res;
    }
}