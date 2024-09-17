import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        
        Map<Character,Integer> map = new HashMap<>();
        int n1 = x.length(),n2 = y.length();
        for(int i = 0;i<n2;i++) {
            map.put(y.charAt(i),map.getOrDefault(y.charAt(i),0)+1);
        }
        
        for(int i = 0;i<n1;i++) {
            if (map.containsKey(x.charAt(i)) && map.get(x.charAt(i)) > 0) {
                map.put(x.charAt(i),map.get(x.charAt(i))-1);
            }
        }
        int res = 0;
        for(Map.Entry<Character,Integer> ele: map.entrySet()) {
            res+=ele.getValue();
        }
        System.out.println(res);
    }
}
