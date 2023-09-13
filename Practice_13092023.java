package EveryDayPractice;

//Given two numbers 'N' and 'S', find the largest number that can be formed with 'N' digits and whose sum of digits should be equals to 'S'. Return -1 if it is not possible.
//Example 1: Input: N = 2, S = 9
//Output: 90
//Explanation: It is the biggest number with sum of digits equals to 9.

public class Practice_13092023 {
    public static void main(String[] args) {
        int n=2;
        int sum=9;
        String largest = findLargest(n, sum);
        System.out.println(largest);
    }
    private static String findLargest(int n, int sum) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (sum>0) {
                if(sum>9){
                    sb.append(9);
                }else{
                    sb.append(sum);
                    sum=0;
                }
            }else
                sb.append(0);
        }
        if (sum!=0) {
            return "-1";
        }
        return sb.toString();
    }
}
