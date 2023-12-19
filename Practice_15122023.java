package EveryDayPractice;

import java.util.ArrayList;
import java.util.Arrays;

//We are given a list nums of integers representing a list compressed with run-length encoding.
//Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
//For each such pair, there are freq elements with value val concatenated in a sublist.
//Concatenate all the sub-lists from left to right to generate the decompressed list.
//Return the decompressed list.
//input: nums = [1,2,3,4]
//Output: [2,4,4,4]
//Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
//The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
//At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
public class Practice_15122023 {
    public static void main(String[] args) {
        int[] arr={1,1,2,3};
        concatenation(arr);
    }
    private static void concatenation(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i=i+2) {
            int frequency=arr[i];
            for (int j = 0; j < frequency; j++) {
                ans.add(arr[i+1]);
            }
        }
        System.out.println(ans);
    }
}
