package weirdAlgorithm;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        in.close();
        solve(n);
    }

    private void solve(long n) {
        System.out.print(n);
        if(n==1) return;
        System.out.print(" ");
        if(n%2==0){
            solve(n/2);
        }else{
            solve(n*3+1);
        }
    }
}
