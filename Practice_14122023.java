package EveryDayPractice;

//You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
//Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
//Return the string formed after mapping.
//The test cases are generated so that a unique mapping will always exist.
//Example 1: Input: s = "10#11#12"
//Output: "jkab"
//Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
//Example 2: Input: s = "1326#"
//Output: "acz"
public class Practice_14122023 {
    public static void main(String[] args) {
        String s="10#11#12";
        UniqueMapping(s);
    }
    private static void UniqueMapping(String s) {
        StringBuilder sb = new StringBuilder();
        String s1="";
        String s2="";
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-2 && s.charAt(i+2) == '#') {
                s1= s.substring(i,i+2);
                i=i+2;
                int i1 = (char) Integer.parseInt(s1) + 96;
                char c1= (char) i1;
                sb.append(c1);
            }else {
                s2 = s.substring(i, i + 1);
                int i1 = Integer.parseInt(s2) + 96;
                char c2= (char) i1;
                sb.append(c2);
            }
        }
        System.out.println(sb);
    }
}