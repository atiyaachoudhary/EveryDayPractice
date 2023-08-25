package EveryDayPractice;

import java.util.Arrays;

// The output should print all negative numbers, followed by all positive numbers.
//Input:  [9, -3, 5, -2, -8, -6, 1, 3]
//Output: [-3, -2, -8, -6, 5, 9, 1, 3]
public class Practice35 {
    public static void main(String[] args) {
        int[] arr={9,-3,5,-2,-8,-6,1,3};
        int[] ints = printNumber(arr);
        System.out.println(Arrays.toString(ints));
    }
    private static int[] printNumber(int[] arr) {
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}