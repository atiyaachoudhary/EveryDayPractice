package EveryDayPractice;

import java.util.logging.Logger;

public class Practice_27062023d {
    public static final Logger log=Logger.getLogger("Practice4");
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        multipleOfArray(arr);
    }
    public static void multipleOfArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int product=1;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    product = product * arr[j];
                }
            }
           log.info(String.valueOf(product));
        }
    }
}
