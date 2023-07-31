package EveryDayPractice;

import java.util.ArrayList;
import java.util.List;
public class StringSolution {
    public static void main(String[] args) {
        String input =  "x3y2w5t4";
        List<String> letter = new ArrayList<>();
        List<Integer> number = new ArrayList<>();

        StringBuilder output = new StringBuilder();
        int c = 0;
        while(c < input.length()){
            letter.add(input.substring(c,c+1));
            number.add(Integer.parseInt(input.substring(c+1,c+2)));
            c = c+2;
        }
        for (int i = 0; i < letter.size(); i++) {
            for (int j = 0; j < number.get(i); j++) {
                output.append(letter.get(i));
            }
            for (int j = 0; j < number.get(number.size()-i-1); j++) {
                output.append(",");
            }
        }
        System.out.println(output);
    }
}