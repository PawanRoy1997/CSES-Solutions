package creatingString;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private final PrintStream printer = new PrintStream(System.out);
    private final StringBuilder result = new StringBuilder();
    public static void main(String[] args) {
        new Solution().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        in.close();
        char[] arr= input.toCharArray();
        Arrays.sort(arr);
        solver(String.valueOf(arr), "");
        int size = result.toString().split("\n").length;
        printer.print(size-1);
        printer.print(result);
    }

    private void solver(String input, String current) {
        boolean[] mask = new boolean[26];
        if(input.isBlank()|| input.isEmpty()){
            result.append("\n").append(current);
        }
        for(int i = 0; i < input.length(); i++){
            if(!mask[input.charAt(i)-'a']) {
                solver(new StringBuilder(input).deleteCharAt(i).toString(), current + input.charAt(i));
                mask[input.charAt(i)-'a']=true;
            }
        }
    }
}