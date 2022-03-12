package trailingZeros;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run(){
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        in.close();
        solve(n);
    }

    private void solve(long n) {
        long ans=0;
        while(n>4){
            ans+= n/5;
            n=n/5;
        }
        printer.print(ans);
    }
}
