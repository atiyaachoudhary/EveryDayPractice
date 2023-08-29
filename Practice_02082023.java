package EveryDayPractice;

import java.util.Arrays;
import java.util.Scanner;

//Write code to print all combinations of positive integers in increasing order that sum to a given positive number.
//For Example:
//Input:  N = 3
// 1 1 1
// 1 2
// 3
public class Practice_02082023 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
        for (int i = arr.length-1; i > 0 ; i--) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,i+1)));
            if (arr[i] - arr[i-1] < 2) {
                arr[i-1]=arr[i-1]+arr[i];
            }else{
                arr[i-1]=arr[i-1]+1;
                arr[i]=arr[i]-1;
                i++;
            }
        }
        System.out.println(arr[0]);
    }
}