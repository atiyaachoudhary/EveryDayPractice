package EveryDayPractice;
//Given an integer array nums, find a subarray that has the largest product, and return the product.
//The test cases are generated so that the answer will fit in a 32-bit integer.
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
public class Practice_20122023 {
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        subArrays(arr);
    }
    private static void subArrays(int[] arr) {
        int product=1,result = 0;
        for (int i = 0; i < arr.length; i++) {
            product=arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                result=Math.max(result,product);
                product*=arr[j];
            }
            result=Math.max(result,product);
        }
        System.out.println(result);
    }
}