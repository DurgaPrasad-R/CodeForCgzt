import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        
        while (sc.hasNext()) {
            arr.add(sc.nextInt());
        }
        
        int n = arr.size();
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int i = n - 1;i>=0;i--) {
            if (arr.get(i) > max) {
                res+=1;
                max = arr.get(i);
            }
        }
        System.out.println(res);
    }
}
