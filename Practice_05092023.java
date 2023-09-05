package EveryDayPractice;

public class Practice_05092023 {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        trap(height);
    }
        public static void trap(int[] height) {
            int count = 0;
            for (int i = 0; i < height.length - 1; i++) {
                int th = height[i];
                int nh = height[i + 1];
                if (nh >= th) {
                    continue;
                }
                int lastcount = count;

                int maxEl = 0;
                for (int j = i + 1; j < height.length; j++) {
                    int bucketH = height[j];
                    if (bucketH < th) {
                        maxEl = Math.max(maxEl, bucketH);
                        continue;
                    }
                    for (int n = i + 1; n < j; n++) {
                        int dif = th - height[n];
                        count += dif;
                    }
                    if (count != lastcount)
                        i = j - 1;
                    break;
                }
                if (count == lastcount) {
                    for (int j = i + 1; j < height.length; j++) {
                        int bucketH = height[j];
                        if (bucketH < maxEl) {
                            continue;
                        }
                        for (int n = i + 1; n < j; n++) {
                            int dif = maxEl - height[n];
                            count += dif;
                        }
                        if (count != lastcount)
                            i = j - 1;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
}
