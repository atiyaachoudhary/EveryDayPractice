package PracticeProblem;

import java.util.Arrays;
public class Practice10 {
    public static void main(String[] args) {
        int[] arr={0, 0, 1, 0, 1, 0, 0 };
        subArray(arr);
    }
    public static void subArray(int[] arr){
        int length=0;
        for (int i = 0; i < arr.length; i++) {
            int count1=0, count2=0;
            int[] subArray = new int[0];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    count1++;
                } else
                    count2++;
                if (count1 == count2 && length<j-i) {
                    length=j-i;
                    subArray = Arrays.copyOfRange(arr, i, j+1);
                    System.out.println(Arrays.toString(subArray));
                }
            }
        }
    }
}
