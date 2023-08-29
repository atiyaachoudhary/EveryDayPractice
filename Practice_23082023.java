package EveryDayPractice;

import java.util.Arrays;

//Input: K = 2, N = 4
//Arr[] = {1, 5, 8, 10}
//Output: 5
//Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
//The difference between the largest and the smallest is 8-3 = 5.
public class Practice_23082023 {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 10};
        int k=2,n=4;
        diffrence(arr,k,n);
    }
    private static void diffrence(int[] arr, int k, int n) {
        int diff=0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i==1) {
                arr[i]=arr[i]+k;
            }else{
                arr[i]=arr[i]-k;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        diff=arr[n-1]-arr[0];
        System.out.println(diff);
    }
}
