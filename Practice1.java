package PracticeProblem;

import java.util.logging.Logger;
public class Practice1 {
    private static final Logger logger = Logger.getLogger("practice1");
    public static void main(String[] args) {
        int[] arrayOfInteger = {8, 7, 2, 5, 3, 1};

        int sum = 10;
        findSum(arrayOfInteger,sum);
    }
    public static void findSum(int[] arrayOfInteger,int sum){
        boolean flag=false;
        for (int i = 0; i < arrayOfInteger.length-1; i++) {
            for (int j = i+1; j < arrayOfInteger.length ; j++) {
                if (sum== arrayOfInteger[i]+arrayOfInteger[j] ) {
                    logger.info("Output: Pair found (" + arrayOfInteger[i] +","+ arrayOfInteger[j]+")");
                    flag=true;
                }
            }
        }
        if (flag==false){
            logger.info("Output: Pair not found");
        }
    }
}
