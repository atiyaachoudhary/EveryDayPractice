package EveryDayPractice;
//Given two circles C1 of radius R1 and C2 of radius R2,centered at (X1,Y1) and (X2,Y2) respectively.
//Find out whether they touch(at one or more than one points).
//Input: X1=3, Y1=4, R1=5
//Input: X2=14, Y2=18, R2=8
//Output:0
//Explanation:The circles centred at (3,4) and (14,18) and having radii 5 and 8 respectively do not touch each other.
public class Practice30 {
    public static void main(String[] args) {
        int x1=3, y1=4, r1=5;
        int x2=14, y2=18, r2=18;
        circleIntersect(x1,y1,r1,x2,y2,r2);
    }
    private static void circleIntersect(int x1, int y1, int r1, int x2, int y2, int r2) {
        double c1c2= Math.sqrt((x1 - x2)*(x1 - x2)+(y1-y2)*(y1-y2));
        System.out.println(c1c2);
        if (c1c2 <= r1-r2) {
            System.out.println("c2 is inside c1");
        } else if (c1c2 <= r2-r1) {
            System.out.println("c1 is insidec2");
        } else if (c1c2 < r1+r2) {
            System.out.println("intersect each other");
        } else if (c1c2 == r1+r2) {
            System.out.println("touch each other");
        }else {
            System.out.println("not touch each other");
        }
    }

}
