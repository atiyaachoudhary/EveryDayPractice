package EveryDayPractice;

import java.util.ArrayList;

public class Practice13b {
    public static void main(String[] args) {
        int[] price={1, 5, 8, 9, 10, 17, 17, 20};
        int n=4;
        maxProfit(price, n);
    }
    private static void maxProfit(int[] price,int n) {
        for (int i = 0; i <=n ; i++) {
            int j=i+1,sum=0;
            ArrayList<Integer> list=new ArrayList<>();
            for (int k = j; k <= n ; k++) {
                sum=sum+price[i];
            }
            list.add(sum);
            System.out.println(sum);
        }
    }
}