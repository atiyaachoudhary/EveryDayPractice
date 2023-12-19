package EveryDayPractice;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
//Input: nums = [1], k = 1
//Output: [1]
public class Practice_19122023 {
    public static void main(String[] args) {
        int k=1;
//        int[] arr={1,1,1,2,2,3};
        int[] arr={1};
        mostFrequent(arr,k);
    }
    private static void mostFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                Integer previousCount = map.get(arr[i]);
                count = previousCount + 1;
                map.put(arr[i], count);
            } else
                map.put(arr[i], 1);
        }
        List<Integer> collect = map.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .map(integerIntegerEntry -> integerIntegerEntry.getKey()).limit(k).collect(Collectors.toList());
        System.out.println(collect);
    }
}