package EveryDayPractice;
//Given an integer array, trim it such that its maximum element becomes less than twice the minimum, return the minimum number of removals required for the conversion.
//Input:  [4, 6, 1, 7, 5, 9, 2]
//Output: The minimum number of removals is 4
//The trimmed array is [7, 5, 9] where 9 < 2 × 5.
//Input:  [4, 2, 6, 4, 9]
//Output: The minimum number of removals is 3
//The trimmed array is [6, 4] where 6 < 2 × 4.
public class Practice_08082023 {
    public static void main(String[] args) {
        int[] arr={4,6,1,7,5,9,8};
        trimArray(arr);
    }
    private static void trimArray(int[] arr) {
        int max;
        int min;
        int maxRange=0;
        for (int i = 0; i < arr.length; i++) {
            min=arr[i];
            max=arr[i];
            for (int j = i; j <arr.length ; j++) {
                min = Integer.min(min,arr[j]);
                max=Integer.max(max,arr[j]);
                if (min*2 <= max) {
                    break;
                }
                maxRange=Integer.max(maxRange,j-i+1);
            }
        }
        System.out.println(arr.length-maxRange);
    }
}