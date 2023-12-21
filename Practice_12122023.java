package EveryDayPractice;
//Jarvis is weak in computing palindromes for Alphanumeric characters.
//While Ironman is busy fighting Thanos, he needs to activate sonic punch but Jarvis is stuck in computing palindromes.
//You are given a string S containing alphanumeric characters. Find out whether the string is a palindrome or not.
//If you are unable to solve it then it may result in the death of Iron Man.
//Example 1: Input : S = "I am :IronnorI Ma, i"
//Output : YES
//Explanation:
//Ignore all the symbol and whitespaces S = "IamIronnorIMai".
//Now, Check for pallandrome ignoring uppercase and lowercase english letter.
//Example 2: Input : S = Ab?/Ba
//Output :  YES
public class Practice_12122023 {
    public static void main(String[] args) {
        String s="Ab?/Baw";
        palindromeString(s);
    }
    private static void palindromeString(String s) {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String lowerCase = sb.toString().toLowerCase();
        StringBuilder reverse = sb.reverse();
        if (lowerCase.equals(reverse.toString().toLowerCase())) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        char ch3=97;
        System.out.println(ch3);
    }
}