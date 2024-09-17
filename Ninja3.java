import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Map<Character,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = s.length();
        int c = 1;
        char ch = s.charAt(0);
        String res = "";
        for(int i = 1;i<n;i++) {
            if (s.charAt(i) == ch) {
                c+=1;
            } else {
                res+=ch+""+c;
                ch = s.charAt(i);
                c = 1;
            }
            ch = s.charAt(i);
        }
        res += ch+""+c;
        System.out.println(res);
    }
}
