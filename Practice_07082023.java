package EveryDayPractice;
//Given an integer array, find all distinct combinations of a given length k, where the repetition of elements is allowed.
//Input:  {1, 2, 3, 4}, k = 2
//Output: {1, 1}, {1, 2}, {1, 3}, {1, 4}, {2, 2}, {2, 3}, {2, 4}, {3, 3}, {3, 4}, {4, 4}
public class Practice_07082023 {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int k=2;
        distinctCombination(arr,k);
    }
    private static void distinctCombination(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((arr[i]+","+arr[j]) != (arr[j]+","+arr[i])) {
                        System.out.print("{"+arr[i]+","+arr[j]+"}");
                }
            }
        }
    }
}
