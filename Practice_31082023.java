package EveryDayPractice;

import java.util.HashMap;
import java.util.Map;

//S1 = bcadeh
//S2 = hea
//Output: 3
//Explanation: We need to remove b, c
//and d from S1.
public class Practice_31082023 {
    public static void main(String[] args) {
        String S1="bcadeh";
        String S2="hea";
        int ans = remAnagrams(S1, S2);
        System.out.println(ans);
    }
    private static int remAnagrams(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap();
        int count=0;
        for (int i = 0; i <s1.length() ; i++) {
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch= s1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)-1);
                if (map.get(ch)==0) {
                    map.remove(ch);
                }else
                    count++;
            }
        }
        int c=0;
        for(Map.Entry entry: map.entrySet()){
            c+=(int)entry.getValue();
        }
        return count+c;
    }
}