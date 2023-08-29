package EveryDayPractice;

import java.util.Arrays;
import java.util.Scanner;

//For Example:
//Input: n = 3
//Output: [[1], [1, 1], [1, 2, 1]]
//Input: n = 5
//Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
public class Practice_11082023b {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int[] temp = new int[0];
        for (int i = 1; i <= n ; i++) {
            int[] arr=new int[i];
            for (int j = 0; j < i ; j++) {
                if(j==0 || j==i-1){
                    arr[j]=1;
                }
                else {
                    arr[j]=temp[j]+temp[j-1];
                }
            }
            temp=arr;
            System.out.println(Arrays.toString(arr));
        }
    }
}
