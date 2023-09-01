package EveryDayPractice;

public class Practice_01092023 {
    public static void main(String[] args) {
        String s="255.100.50.0";
        validIP4(s);
    }
    private static void validIP4(String s) {
        System.out.println(s.replace(".","[.]"));
    }
}
