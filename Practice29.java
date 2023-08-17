package EveryDayPractice;

import java.util.Arrays;

//Given an integer array having distinct elements, find the surpasser count for each element in it. In other words, for each array element, find the total number of elements to its right, which are greater than it.
//Input:  { 4, 6, 3, 9, 7, 10 }
//Output: { 4, 3, 3, 1, 1, 0 }
public class Practice29 {
    public static void main(String[] args) {
        int[] arr={4, 6, 3, 9, 7, 10 };
        findSurpasser(arr);
    }
    private static void findSurpasser(int[] arr) {
        int[] a=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[i]) {
                    count++;
                }
                a[i]=count;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
