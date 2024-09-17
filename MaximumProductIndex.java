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
        int max = 0;
        for(int i = 1;i<n-1;i++) {
            int left = 0,right = 0;
            // System.out.println(i);
            for(int j = i - 1;j>=0;j--) {
                if (arr.get(j) > arr.get(i)) {
                    left = j;
                    break;
                }
            }
            
            for(int k = i+1;k<n;k++) {
                if (arr.get(k) > arr.get(i)) {
                    right = k;
                }
            }
            
            max = Math.max(max,right*left);
            // System.out.println(max);
        }
        System.out.println(max);
    }
}
