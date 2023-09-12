package EveryDayPractice;

import java.util.ArrayList;

//Input: N = 6
//Output: 2
//Explanation: Binary representation is '110'. So the count of the set bit is 2.
//Input: N = 8
//Output: 1
//Explanation: Binary representation is '1000'. So the count of the set bit is 1.
public class Practice_08092023 {
    public static void main(String[] args) {
        int N=136;
        binaryRepresentation(N);
    }
    private static void binaryRepresentation(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while (n>0){
            list.add(n%2);
            n=n/2;
        }
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                count++;
            }
        }
        System.out.println(list);
        System.out.println(count);
    }
}
