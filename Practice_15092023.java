package EveryDayPractice;

//Given an array arr[] of size N, check if it can be partitioned into two parts such that the sum of elements in both parts is the same.
//input: N = 4 arr = {1, 5, 11, 5}
//Output: YES
//Explanation: The two parts are {1, 5, 5} and {11}.
public class Practice_15092023 {
    public static void main(String[] args) {
        int n=4;
        int[] arr={1,5,11,5};
        isSubsetSum(n,arr);
    }
    private static boolean isSubsetSum(int n, int[] arr) {
        int[][] ans=new int[2][2];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        if (sum % 2 == 0) {
            return false;
        }
        return true;
    }
}