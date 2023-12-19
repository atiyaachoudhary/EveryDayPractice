package EveryDayPractice;
//Given a string S, find the longest palindromic substring in S.
//Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string that reads the same backward.
//More formally, S is a palindrome if reverse(S) = S. In case of conflict, return the substring which occurs first ( with the least starting index).
//Example 1:
//Input: S = "aaaabbaa"
//Output: aabbaa
//Explanation: The longest Palindromic substring is "aabbaa".
public class Practice_18122023 {
    public static void main(String[] args) {
        String s="aaaabbaa";
        reversePalindrome(s);
    }
    private static void reversePalindrome(String s) {
        int size=0;
        String ans="";
        StringBuilder sb=null;
        for (int i = 0; i < s.length(); i++) {
            sb=new StringBuilder();
            sb.append(s.substring(0,i));
            String reverse = sb.reverse().toString();
            if (sb.toString().equals(reverse) && size<reverse.length()) {
                size=reverse.length();
                ans=sb.toString();
            }
        }
        System.out.println(ans.toString());
    }
}
