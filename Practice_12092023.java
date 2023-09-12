package EveryDayPractice;

import java.util.Arrays;

//Input: N = 6, arr[] = 7 10 4 3 20 15, K = 3
//Output : 7
//Explanation : 3rd smallest element in the given array is 7.
public class Practice_12092023 {
    public static void main(String[] args) {
        int n=6;
        int[] arr={7, 10, 4, 20, 15};
        int k=4;
        kthSmallest(n,k,arr);
    }
    private static void kthSmallest(int n, int k, int[] arr) {
        Arrays.sort(arr);
        //3,4,7,10,15,20
        System.out.println(arr[k-1]);
    }
}
