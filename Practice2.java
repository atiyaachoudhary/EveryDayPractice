package EveryDayPractice;
public class Practice2 {

    public static void main(String[] args) {
        int[] arrayOfInteger = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        findSum(arrayOfInteger,sum);
    }
    public static void findSum(int[] arrayOfInteger, int sum){
        boolean flag=false;
        for (int i = 0; i < arrayOfInteger.length-1; i++) {
            for (int j = i+1; j <arrayOfInteger.length ; j++) {
                if (sum == arrayOfInteger[i]+arrayOfInteger[j]) {
                    System.out.println("pair found ("+ arrayOfInteger[i] + "," + arrayOfInteger[j]+ ")");
                    flag=true;
                };
            }
        }
        if (flag == flag) {
            System.out.println("not found");
        }
    }
}