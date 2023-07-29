package PracticeProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        zeroSum(arr);
    }
    public static void zeroSum(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            ArrayList<Integer> subArray=new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                sum=sum+arr[j];
                subArray.add(arr[j]);
                if (sum==0) {
                    System.out.println(subArray.toString());
                }
            }
        }
    }
}
