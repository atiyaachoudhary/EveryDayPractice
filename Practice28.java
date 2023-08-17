package EveryDayPractice;

import java.util.Arrays;

public class Practice28 {
    public static void main(String[] args) {
        int[] red={6, 3, 2, 8, 7};
        int[] blue={8, 6, 7, 2, 3};
        pair(red,blue);
    }
    private static void pair(int[] red, int[] blue) {
        int temp=0;
        for (int i = 0; i <red.length-1 ; i++) {
            for (int j = i+1; j < red.length ; j++) {
                if (red[i] > red[j]) {
                   temp=red[i];
                   red[i]=red[j];
                   red[j]=temp;
                } else if (blue[i] > blue[j]) {
                    temp=blue[i];
                    blue[i]=blue[j];
                    blue[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(red));
        System.out.println(Arrays.toString(blue));
    }
}
