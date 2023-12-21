package EveryDayPractice;
//Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
//NOTE*: A subarray is a contiguous part of any given array.
//Example 1: Input: N = 4, K = 2
//Arr = [100, 200, 300, 400]
//Output:700
//Explanation: Arr3  + Arr4 =700, which is maximum.
//Example 2: Input: N = 4, K = 4
//Arr = [100, 200, 300, 400]
//Output: 1000
//Explanation: Arr1 + Arr2 + Arr3 + Arr4 =1000, which is maximum.
public class Practice_11122023 {
    public static void main(String[] args) {
        int[] arr={100,200,300,400};
        int k=4;
        sumSubarray(arr,k);
    }
    private static void sumSubarray(int[] arr, int k) {
        int sum,result=0;
        for (int i = 0; i < arr.length-1; i++) {
            sum=arr[i];
            for (int j = i+1; j <i+k; j++) {
                sum=sum+arr[j];
                result=Math.max(sum,result);
            }
            result=Math.max(result,sum);
        }
        System.out.println(result);
    }
}