package EveryDayPractice;
public class Practice17b {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,2,1};
        sortArr(arr);
    }
    private static void sortArr(int[] arr) {
        int temp=999999999;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    //do nothing
                } else if (arr[i]<arr[j]) {
                    temp=j;
                }
            }
        }
    }
}
