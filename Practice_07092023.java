package EveryDayPractice;

//Input: N = 6, X = 16
//Arr[] = {1, 4, 45, 6, 10, 8}
//Output: Yes
//Explanation: Arr[3] + Arr[4] = 6 + 10 = 16

import java.util.Arrays;
import java.util.HashSet;

public class Practice_07092023 {
    public static void main(String[] args) {
        int n=5;
        int[] arr={1,2,5,6,7};
        boolean ans = sumArray(n, arr);
        System.out.println(ans);
    }
    private static boolean sumArray(int n, int[] arr) {
        int x=4;
        for(int i=0; i<n-1;i++){
            if(arr[i]<=x){
                for(int j=i+1; j<n; j++){
                    if(arr[i]+arr[j]==x){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
