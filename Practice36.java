package EveryDayPractice;

import java.util.HashSet;

//A pangram is a sentence where every letter of the English alphabet appears at least once.
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
public class Practice36 {
    public static void main(String[] args) {

        //ascii value of A to Z is 65 to 90.
        //ascii value of a to z is 97 to 122.

//        String input="thequickbrownfoxjumpsoverthelazydog";
        String input="leetcode";
        boolean pangrams = pangrams(input);
        System.out.println(pangrams);
    }
    public static boolean pangrams(String input) {
        HashSet<Character> uniqueLetters = new HashSet<>();
        for(char c : input.toCharArray()){
            uniqueLetters.add(c);
        }
        System.out.println(uniqueLetters);
        return uniqueLetters.size() == 26;
    }
}