package EveryDayPractice;

//check whether the strijg is anagrams or not.
//Input:
// a = geeksforgeeks, b = forgeeksgeeks
//output: Yes

import java.util.Arrays;
public class Practice_22082023 {
    public static void main(String[] args) {

//        String s1="geeksforgeeks";
        String s1="allergy";

//        String s2="forgeeksgeeks";
        String s2="allergic";
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean result = Arrays.equals(ch1, ch2);

        if (result) {
            System.out.printf("Yes");
        }else {
            System.out.printf("No");

        }
    }
}