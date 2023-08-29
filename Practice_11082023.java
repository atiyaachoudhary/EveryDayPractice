package EveryDayPractice;

import java.util.Scanner;

//For Example:
//Input: n = 3
//Output: [[1], [1, 1], [1, 2, 1]]
//Input: n = 5
//Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
public class Practice_11082023 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            int k=1;
            for (int l = 1; l <=i ; l++) {
                System.out.print(k+" ");
                k=k*(i-l)/l;
            }
            System.out.println();
        }
    }
}