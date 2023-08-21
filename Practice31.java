package EveryDayPractice;

public class Practice31 {
    public static void main(String[] args) {
        int n=-15,m=6;
        int q=n/m;
        System.out.println(q);
        int n1=q*m; //1st possibility
        int n2=(n*m)>0 ? (m*(q+1)) : (m*(q-1)); //2nd possibility
        System.out.println(n2);
        if (Math.abs(n-n1) < Math.abs(n-n2)) {
            System.out.println(n1);
        }else {
            System.out.println(n2);
        }
    }
}