package PracticeProblem;
public class Practice14b {
    public static void main(String[] args) {
        int[] input= { 1, 3, 5, 7 };
        int target= 8;
        int result = distinctWays(input, target);
        System.out.println(result);
    }
    private static int distinctWays(int[] input, int target) {
        int[] combinations=new int[target+1];
        combinations[0]=1;
        for (int coin : input) {
            for (int i = coin; i <= target; i++) {
                combinations[i] += combinations[i - coin];
            }
        }
        return combinations[target];
    }
}