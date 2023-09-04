package EveryDayPractice;

//Input : N = 5, K = 3
//arr[] = {1,2,3,4,5}
//Output: 3 2 1 5 4
//Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.

import java.util.Arrays;

public class Practice_04092023 {
    public static void main(String[] args) {
        int k=3;
        int[] arr={1,2,3,4,5,6,7,8,9};
        reverseSubArray(arr, k);
    }
    private static void reverseSubArray(int[] arr, int k) {
        for (int i = 0; i < arr.length; i+=k) {
            int left=i;
            int right=Math.min(i+k-1, arr.length-1);
            int temp;
            while (left<right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
