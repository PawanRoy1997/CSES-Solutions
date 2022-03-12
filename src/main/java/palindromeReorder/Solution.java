package palindromeReorder;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        in.close();
        solve(input.toLowerCase());
    }

    private void solve(String input) {
        int[] charCounts = new int[26];
        int oddChars = 0;
        char oddChar = '0';
        for (char c : input.toCharArray()) {
            charCounts[c - 'a']++;
        }
        for (int count : charCounts) {
            if (count % 2 == 1) {
                oddChars++;
            }
        }
        if (oddChars > 1) {
            printer.print("NO SOLUTION");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                int half = charCounts[i] / 2;
                while (half-- > 0) {
                    sb.append((char)('a' + i));
                }
                if (charCounts[i] % 2 != 0) {
                    oddChar = (char) ('a' + i);
                }
            }
            String result = sb.toString();
            if(oddChar!='0'){
                result+=oddChar;
            }
            result+= sb.reverse().toString();
            printer.print(result.toUpperCase());
        }
    }
}
