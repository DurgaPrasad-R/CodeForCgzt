import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        int n = s.length();
        Stack<Character> stk = new Stack<>();
        for(int i = 0;i<n;i++) {
            if (stk.isEmpty() || (!stk.isEmpty() && stk.peek() != s.charAt(i))) {
                stk.push(s.charAt(i));
            } else {
                continue;
            }
        }
        
        while (!stk.isEmpty()) {
            res += stk.pop();
        }
        System.out.println(res);
    }
}
