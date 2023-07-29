package PracticeProblem;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {
//        int[] x=  { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] x= {0, 5, 7, 0, 0, 0, 0, 8, 9};
//        int[] y= { 1, 8, 9, 10, 15 };
        int[] y= {1, 2, 3, 4, 6};

        mergeAndSort(x,y);
    }
    private static void mergeAndSort(int[] x, int[] y) {
        int[] result=new int[x.length];
        int i=0,j=0,k=0;

       while (k<result.length){
           if (i >= x.length) {
               result[k]=y[j];
               j++;
               k++;
           } else if (j >= y.length && x[i]!=0) {
               result[k]=x[i];
               i++;
               k++;
           } else if (x[i] == 0) {
               i++;
           } else if (x[i]<y[j]) {
               result[k]=x[i];
               i++;
               k++;
           } else if (y[j]<x[i]) {
               result[k]=y[j];
               j++;
               k++;
           }
       }
        System.out.println(Arrays.toString(result));
    }
}