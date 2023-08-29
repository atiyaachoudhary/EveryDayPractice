package EveryDayPractice;

import java.util.Scanner;

//Given a number N. Count the number of digits in N which evenly divides N.
//Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
//Input:
//N = 12
//Output:2
//Explanation:
//1, 2 both divide 12 evenly
public class Practice_10082023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Give a number");
        n = sc.nextInt();
        evenDivisible(n);
    }
    private static void evenDivisible(int n) {
        int temp1;int temp2;
        temp1=n/10;
        temp2=n%10;
        if(n>0 && n%temp1==0 && n%temp2==0){
            System.out.println(temp1+" and "+temp2+" both divisible");
        }else
        {
            System.out.println(temp1+" and "+temp2+" none of them divisible");
        }
    }
}