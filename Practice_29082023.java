package EveryDayPractice;

public class Practice_29082023 {
    public static void main(String[] args) {
        String s= "Let's take LeetCode contest";
        reverseOrder(s);
    }
    private static void reverseOrder(String s) {
        String[] s1=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            StringBuilder str = new StringBuilder(s1[i]);
            sb.append(str.reverse());
            if(i != s1.length-1)
                sb.append(" ");
        }
        System.out.println(sb);
    }
}