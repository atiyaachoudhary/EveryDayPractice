package EveryDayPractice;

import java.util.Arrays;

public class Practice_21112023 {
    public static void main(String[] args) {
        String S= "i.like.this.program.very.much";
        reverseString(S);
    }
    private static void reverseString(String s) {
        String[] split = s.split(".",1);
        for(String ans: split)
            System.out.println(ans);
    }
}
