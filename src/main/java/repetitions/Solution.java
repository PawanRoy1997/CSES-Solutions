package repetitions;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        String sequence = in.next();
        in.close();
        solve(sequence);
    }

    private void solve(String sequence) {
        int iCurr = 0, max = 0;
        char cCurr = 'a';
        for (char c : sequence.toCharArray()) {
            if(c == cCurr){
                iCurr++;
            }else{
                cCurr = c;
                iCurr = 1;
            }

            if(iCurr>max){
                max = iCurr;
            }
        }

        System.out.print(max);
    }
}
