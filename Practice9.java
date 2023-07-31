package EveryDayPractice;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Practice9 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        duplicateElement(arr);
    }
    public static void duplicateElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount=0, maxValue=0;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count=map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> element: map.entrySet() ) {
            if (maxCount < element.getValue()) {
                maxCount=element.getValue();
                maxValue=element.getKey();
            }
        }
        int[] result=new int[maxCount];
        Arrays.fill(result,maxValue);
        System.out.println(Arrays.toString(result));
    }
}