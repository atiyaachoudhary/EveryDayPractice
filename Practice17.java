package EveryDayPractice;

import java.util.ArrayList;

//Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together and the relative order of the first occurrence of each element remains unchanged.
//        For example:
//        Input:  { 1, 2, 3, 1, 2, 1 }
//        Output: { 1, 1, 1, 2, 2, 3 }
//        Input:  { 5, 4, 5, 5, 3, 1, 2, 2, 4 }
//        Output: { 5, 5, 5, 4, 4, 3, 1, 2, 2 }
public class Practice17 {
    public static void main(String[] args) {
//        int [] arr={1,2,3,1,2,1};
        int[] arr={5, 4, 5, 5, 3, 1, 2, 2, 4};
        reArrange(arr);
    }
    private static void reArrange(int [] arr) {
        int temp=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                  list.add(arr[j]);
                  j++;
                } else if (arr[i]<arr[j] && arr[i]>arr[j]) {
                    j++;
                }
            }
            if (list.size() == arr.length) {
                break;
            }
        }
        System.out.println(list);
    }
}