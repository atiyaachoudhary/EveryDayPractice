package EveryDayPractice;

import java.util.ArrayList;
import java.util.List;
//Given an unlimited supply of coins of given denominations, find the total number of distinct ways to get the desired change.
//        For example:
//        Input: S = { 1, 3, 5, 7 }, target = 8
//        The total number of ways is 6
public class Practice_18072023 {
    public static void main(String[] args) {
        int[] input= { 1, 3, 5, 7 };
        int target= 8;
        distinctWays(input, target);
    }
    private static void distinctWays(int[] input, int target) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i < input.length-1 ; i++) {
            int sum=0;
            sum=input[i]+input[i+1];
            if (sum == 8)
                list.add(List.of(input[i],input[i+1]));
            else if (sum < 8 && i+2 < input.length) {
                sum=sum+input[i+2];
                if (sum == 8)
                    list.add(List.of(input[i],input[i+1]));
            }
        }
        System.out.println(list);
    }
}
