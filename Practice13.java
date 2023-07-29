package PracticeProblem;

//Given a rod of length n and a list of rod prices of length i, where 1 <= i <= n, find the optimal way to cut the rod into smaller rods to maximize profit.
//        For example, consider the following rod lengths and values:
//        Input: length[] = [1, 2, 3, 4, 5, 6, 7, 8]
//        price[] = [1, 5, 8, 9, 10, 17, 17, 20]
//        Rod length: 4
public class Practice13 {
    public static void main(String[] args) {
        int n=4;
        int price[]={1, 5, 8, 9, 10, 17, 17, 20};
        cutRodMaxProfit(price, n);
        System.out.println("Maximum profit is " + cutRodMaxProfit(price, n));
    }
    private static int cutRodMaxProfit(int[] price, int n) {
        if (n == 0) {
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cost = price[i - 1] + cutRodMaxProfit(price, n - i);
            if (cost > maxValue) {
                maxValue = cost;
            }
        }
        return maxValue;
    }
}