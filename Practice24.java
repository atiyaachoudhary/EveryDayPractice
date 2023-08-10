package EveryDayPractice;

import java.util.Arrays;
//merge sort
public class Practice24 {
    public static void main(String[] args) {
        int arr[]={6,3,7,8,2,5};
        divide(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void divide(int arr[],int beg,int end){
        if(beg>=end){
            return;
        }
        int mid=beg + (end-beg)/2;
        divide(arr, beg,mid);
        divide(arr,mid+1,end);
        conquer(arr,beg,mid,end);
    }
    private static void conquer(int[] arr, int beg, int mid, int end) {
        int merged[]=new int[end-beg+1];
        int n1 = beg;
        int n2 = mid+1;
        int x= 0;

        while(n1<=mid && n2<=end){
            if(arr[n1]<=arr[n2]){
                merged[x]=arr[n1];
                x++;
                n1++;
            }else{
                merged[x]=arr[n2];
                x++;
                n2++;
            }
        }
        while (n1<=mid){
            merged[x]=arr[n1];
            x++;
            n1++;
        }
        while (n2<=end){
            merged[x]=arr[n2];
            x++;
            n2++;
        }
        for (int i = 0,j=beg; i < merged.length; i++,j++) {
            arr[j]=merged[i];
        }
    }
}