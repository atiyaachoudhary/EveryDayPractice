package EveryDayPractice;

public class StringSolutionb {
    public static void main(String[] args) {
        String input = "x3y2w5t4,";
        String ans = convertString(input);
        System.out.println(ans);
    }
    private static String convertString(String input) {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char character=input.charAt(i);
            if(Character.isLetter(character)){
                int count = Character.getNumericValue(input.charAt(i+1));
                sb.append(String.valueOf(character).repeat(count));
            }
            Character c = input.charAt(input.length() - i-1);
            if (Character.isDigit(c)){
                sb.append(String.valueOf(",").repeat(Integer.parseInt(c.toString())));
            }
        }
        return sb.toString();
    }
}