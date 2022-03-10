package numberSpiral;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Solution {
    private final PrintStream out = new PrintStream(System.out);

    public static void main(String[] args) {
        new Solution().run();
    }

    private void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int cases = Integer.parseInt(in.readLine());
            while (cases-- > 0) {
                String[] inputs = in.readLine().split(" ");
                long x = Long.parseLong(inputs[0]);
                long y = Long.parseLong(inputs[1]);
                solve(x, y);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
//        in.close();
    }

    public void solve(long x, long y) {
        long ans;
        if(x==y&& x==1){
            ans = 1;
        }else {
            if (x > y) {
                if (x % 2 == 0) {
                    ans = x * x;
                    ans -= y;
                    ++ans;
                } else {
                    --x;
                    ans = x * x;
                    ans += y;
                }
            } else {
                if (y % 2 == 0) {
                    --y;
                    ans = y * y;
                    ans += x;
                } else {
                    ans = y * y;
                    ans -= x;
                    ++ans;
                }
            }
        }
        out.println(ans);
    }
}
