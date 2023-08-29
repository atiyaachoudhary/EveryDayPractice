package EveryDayPractice;

import java.util.Scanner;

//Given a number N. Your task is to check whether it is fascinating or not.
//Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.
//Input: N = 192
//Output: Fascinating
//Explanation: After multiplication with 2 and 3, and concatenating with original
//number, number will become 192384576 which contains all digits from 1 to 9.
public class Practice_14082023 {
    public static void main(String[] args) {
        int n,temp1=2,temp2=3;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        temp1=temp1*n;
        temp2=temp2*n;
        String sum=n+""+temp1+""+temp2;
        System.out.println(sum);
        for (int c='1' ; c <='9' ; c++) {
            int count=0;
            for (int i = 0; i < sum.length(); i++) {
                char ch=sum.charAt(i);
                if (ch == c) {
                    count++;
                }
                if (count>1 || count==0) {
                    flag=false;
                    break;
                }
            }
        }
        if (flag==false){
            System.out.println("fascinating");
        }
        else {
            System.out.println("not fascinating");
        }
    }
}