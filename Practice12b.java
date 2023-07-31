package EveryDayPractice;

public class Practice12b {
    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        findIndexOfMaxSequence(array);
    }
    private static void findIndexOfMaxSequence(int[] array) {
        int maxLength = 0;
        int maxIndex = -1;
        int currentLengthOfOne = 0;
        int lastIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                currentLengthOfOne++;
            } else {
                currentLengthOfOne = i - lastIndex;
                lastIndex = i;
            }
            if (currentLengthOfOne > maxLength) {
                maxLength = currentLengthOfOne;
                maxIndex = lastIndex;
            }
        }
        if (maxIndex != -1) {
            System.out.print("Index to be replaced is " + maxIndex);
        } else {
            System.out.print("Invalid input");
        }
    }
}