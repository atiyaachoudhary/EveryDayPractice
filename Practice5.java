package EveryDayPractice;

import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of element");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
    }

}