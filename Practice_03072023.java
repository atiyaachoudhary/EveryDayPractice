package EveryDayPractice;

import java.util.Arrays;
import java.util.logging.Logger;
public class Practice_03072023 {
    public static final Logger log=Logger.getLogger("Practice6");
    public static void main(String[] args) {
        int[] arr={ 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};
        sortArray(arr);
    }
    public static void sortArray(int[] arr){
        int i=0,k=0, j=arr.length-1, l=arr.length-1;
        while (i<j){
            if (arr[i] == 0) {
                i++;
            } else if (arr[i]!=0 && arr[j]==0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else{
                j--;
            }
            if (arr[l] == 2) {
                l--;
            } else if (arr[l]!=2 && arr[k]==2) {
                int temp=arr[l];
                arr[l]=arr[k];
                arr[k]=temp;
                l--;
                k++;
            }else{
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}