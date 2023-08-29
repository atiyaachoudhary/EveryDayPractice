package EveryDayPractice;

//Find index of 0 to be replaced to get the maximum length sequence of continuous ones
//Given a binary array, find the index of 0 to be replaced with 1 to get the maximum length sequence of continuous ones.
//For example, consider the array { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 }. We need to replace index 7 to get the
//continuous sequence of length 6 containing all 1’s.
public class Practice_14072023 {
    public static void main(String[] args) {
        int[] array={ 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        maxSequensce(array);
    }
    private static void maxSequensce(int[] array) {
        int max_count = 0;
        int max_index = -1;
        int prev_zero_index = -1;
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 1) {
                count++;
            }
            else {
                count = i - prev_zero_index;
                prev_zero_index = i;
            }
            if (count > max_count)
            {
                max_count = count;
                max_index = prev_zero_index;
            }
        }
        if(max_index != -1){
            System.out.print("Index to be replaced is " + max_index);
        }
        else {
            System.out.print("Invalid input");
        }
    }
}