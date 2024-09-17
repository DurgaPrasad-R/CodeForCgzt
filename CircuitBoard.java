import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int pIdx = n - 1,negIdx = 0;
        int sum = 0,flag = 1;
        while (negIdx <= pIdx) {
            if (flag == 1) {
                sum += arr[pIdx];
                pIdx--;
            } else {
                sum-=arr[negIdx];
                negIdx++;
            }
            flag*=-1;
        }
        System.out.println(sum);
        
    }
}
