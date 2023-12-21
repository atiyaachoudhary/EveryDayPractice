package EveryDayPractice;
//Given an array of n integers. Find the minimum positive number to be inserted in array,
//so that sum of all elements of array becomes prime.
//Example 1: Input: N=5
//arr = {2, 4, 6, 8, 12}
//Output: 5
//Explanation: The sum of the array is 32 ,we can add 5 to this to make it 37 which is a prime number.
//Example 2: Input: N=3
//arr = {1, 5, 7}
//Output: 0
//Explanation: The sum of the array is 13 which is already prime.
public class Practice_08122023 {
    public static void main(String[] args) {
        int[] arr={1, 5, 7};
        int n=5;
        int primeNumber = primeNumber(arr, n);
        System.out.println(primeNumber);
    }
    static boolean ifPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int primeNumber(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int val = 0;
        while (true) {
            if (ifPrime(sum)) {
                return val;
            }
            val++;
            sum++;
        }
    }
}
