package EveryDayPractice;

import java.util.Arrays;

// nums[] = { 1, 2, 3, 4, 5 }
// pos[] = { 3, 2, 4, 1, 0 }
// output: nums[] = { 5, 4, 2, 1, 3 }
// i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
// In other words, update nums[pos[i]] = nums[i] for every index i.
public class Practice_03082023 {
    public static void main(String[] args) {
        int[] nums={ 1, 2, 3, 4, 5 };
        int[] pos={3, 2, 4, 1, 0};
        shuffleArray(nums,pos);
    }
    private static void shuffleArray(int[] nums, int[] pos) {
        int[] arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[pos[i]]=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=arr[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}