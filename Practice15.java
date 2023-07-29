package PracticeProblem;
//Given a sorted array of distinct positive integers, print all triplets that forms an arithmetic progression with an integral common difference.
//An arithmetic progression is a sequence of numbers such that the difference between the consecutive terms is constant.
// For instance, sequence 5, 7, 9, 11, 13, 15, … is an arithmetic progression with a common difference of 2.
//Input:  A[] = { 5, 8, 9, 11, 12, 15 }
//Output:
//5 8 11
//9 12 15
public class Practice15 {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 6, 8, 9, 15 };
        commonDiffrence(arr);
    }
    private static void commonDiffrence(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
            }
        }
    }
}
