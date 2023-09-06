package EveryDayPractice;

//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
// 2 is the missing number in the range since it does not appear in nums.

import java.util.Arrays;

//Input: nums = [0,1]
//Output: 2
//Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
// 2 is the missing number in the range since it does not appear in nums.
public class Practice_06092023 {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i++){
            if (nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
