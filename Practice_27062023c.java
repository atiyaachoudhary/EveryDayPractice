package EveryDayPractice;

public class Practice_27062023c {
    public static void main(String[] args) {
        int[] arr={1,2,34,5,7,8,8,9,9,10,77};
        duplicate(arr);
    }
    public static boolean duplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("true and element is "+arr[i]);;
                }
            }
        }
        return false;
    }
}
