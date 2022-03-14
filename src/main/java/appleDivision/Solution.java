package appleDivision;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);
    private long result, half;
    private long sum;

    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Long> weights = new ArrayList<>();
        while (n-- > 0) {
            weights.add(in.nextLong());
        }
        in.close();
        solve(weights);
    }

    private void solve(List<Long> weights) {
        sum = weights.stream().mapToLong(value -> value).sum();
        half = sum / 2;
        result = -1;
        weights.sort(Collections.reverseOrder());
        compute(weights, 0L);
        printer.print(result);
    }

    private void compute(List<Long> input, Long curr) {
        if (curr >= half) {
            long r = (2*curr) - sum;
            if(r==-1){
                r=1;
            }
            if (result > r || result == -1) {
                result = r;
            }
        } else {
            for (int i = 0; i < input.size(); i++) {
                List<Long> temp = new ArrayList<>();
                for (int j = i+1; j < input.size(); j++) {
                    if (i != j) {
                        temp.add(input.get(j));
                    }
                }
                compute(temp, curr + input.get(i));
            }
        }
    }
}