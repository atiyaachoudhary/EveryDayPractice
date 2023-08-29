package EveryDayPractice;

import java.util.Scanner;

//Input:
// arr[] = { 3, 1, 2, 6, 9, 4 }
// k = 5
// Output: Pairs can be formed
// Explanation: Array can be divided into pairs {(3, 2), (1, 9), (4, 6)} where the sum of elements in each pair is divisible by 5.
public class Practice_04082023 {
    public static void main(String[] args) {
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        k=sc.nextInt();
        int[] arr={3,1,2,6,9,4};
        divisiblePair(arr, k);
    }
    private static void divisiblePair(int[] arr, int k) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % k == 0) {
                    System.out.println("Output: Pair found (" + arr[i] +","+ arr[j]+")");
                }
            }
        }
    }
}
