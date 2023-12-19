package EveryDayPractice;
//Given two strings X and Y of lengths m and n respectively,
//find the length of the smallest string which has both, X and Y as its sub-sequences.
//Note: X and Y can have both uppercase and lowercase letters.
public class Practice_13112023 {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="xycd";
        subSequence(s1,s2);
    }
    private static void subSequence(String s1, String s2) {
        int[][] dp= new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j < s2.length(); j++) {

            }
        }
    }
}
