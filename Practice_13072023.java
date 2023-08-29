package EveryDayPractice;

public class Practice_13072023 {
    public static void main(String[] args) {
        int[][] list = {{1, 3}, {2, 3}, {3, 2}, {4, 1}, {5, 3}};
        int bankAmount = 0; // Initializing the uncle's bank amount
        int maxGifts = 0;
        maxGift(list,bankAmount,maxGifts);
    }
    private static void maxGift(int[][] list, int bankAmount, int maxGifts) {
        for (int i = 0; i < list.length; i++) {
            bankAmount++; // Uncle receives 1 unit of money per day
            int giftPrice = list[i][1];
            if (bankAmount >= giftPrice) { //if bankAmount is greater than the giftPrice then maxGift is incremented by one
                bankAmount=bankAmount-giftPrice;
                maxGifts++;
            }
        }
        System.out.println("Maximum number of gifts: " + maxGifts);
    }
}
