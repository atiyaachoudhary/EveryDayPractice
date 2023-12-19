package EveryDayPractice;
//Given an integer N and an integer D, rotate the binary representation of the integer N by D digits to the left as well as right and
// return the results in their decimal representation after each of the rotation.
//Note: Integer N is stored using 16 bits. i.e. 12 will be stored as 0000000000001100.
//N = 28, D = 2
//Output: 112  7
public class Practice_20092023 {
    public static void main(String[] args) {
        int N=28;
        rotate(N);
    }
    private static void rotate(int n) {
        String binaryRight = String.valueOf(Integer.rotateRight(n,2));
        String binaryLeft = String.valueOf(Integer.rotateLeft(n,2));
        System.out.println(binaryRight);
        System.out.println(binaryLeft);
    }
}