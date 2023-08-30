package EveryDayPractice;

import java.util.Arrays;

//Input: command = "G()(al)"
//Output: "Goal"
//Explanation: The Goal Parser interprets the command as follows:
//G -> G
//() -> o
//(al) -> al
public class Practice_30082023 {
    public static void main(String[] args) {
        String S="G()()()()(al)";
        parser(S);
    }
    private static void parser(String s) {
        StringBuilder sb=new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && s.charAt(i+1) == ')') {
                sb.append('o');
                i++;
            } else if (s.charAt(i)=='(' && s.charAt(i+1) == 'a') {
                sb.append("al");
                i=i+3;
            }else
                sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
