package EveryDayPractice;

import java.util.Arrays;

//Input: [2, 3, 4]
//Output: ADG BDG CDG AEG BEG CEG AFG BFG CFG ADH BDH CDH AEH BEH CEH AFH BFH CFH ADI BDI CDI AEI BEI CEI AFI BFI CFI
public class Practice_24082023 {
    public static void main(String[] args) {
        String[] alphabet={null,null,"abc","def","ghi","jkl","mno","prqs","tuv","wxyz"};
        int[] input={2,3,4};
        String[] inputAlphabet=new String[input.length];
        for (int i = 0; i < input.length; i++) {
            inputAlphabet[i]=alphabet[input[i]];
        }
        System.out.println(Arrays.toString(inputAlphabet));
        String output="";
        combination(alphabet,input,inputAlphabet,output,0);
    }
    private static void combination(String[] alphabet, int[] input, String[] inputAlphabet, String output,int count) {
        if (count >= inputAlphabet.length) {
            System.out.println(output);
            return;
        }
        for (int i = 0; i < inputAlphabet[count].length(); i++) {
            combination(alphabet,input,inputAlphabet,output+inputAlphabet[count].charAt(i),count+1);
        }
    }
}
