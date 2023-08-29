package EveryDayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Practice_13072023b {
    public static void main(String[] args) {
        List<List<Integer>> list1=new ArrayList<>();
        list1.add( Arrays.asList(1,3));
        list1.add(Arrays.asList(2,3));
        list1.add(Arrays.asList(3,2));
        list1.add(Arrays.asList(4,1));
        list1.add(Arrays.asList(5,3));
        int bankAmount = 0;
        int maxGifts = 0;
        maxGift(list1,bankAmount,maxGifts);
    }
    private static void maxGift(List<List<Integer>> list1,int bankAmount,int maxGifts) {
        List<Integer> giftPrice = new ArrayList<>();
        for (List<Integer> element:list1) {
            giftPrice.add(element.get(1));
        }
        for (Integer price:giftPrice) {
            bankAmount++;
            if (bankAmount >= price) {
                maxGifts++;
                bankAmount=bankAmount-price;
            }
        }
        System.out.println(maxGifts);
    }
}