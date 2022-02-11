package leetcode;

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea11 {
    public static int maxArea(int[] height) {
        if (height.length <= 1) {
            return 0;
        }
        int m = 0, n = height.length - 1;
        int max = 0;
        int i = height.length - 1;
        while (i >= 1) {
            int area = Math.min(height[m], height[n]) * i;
            if (area > max) {
                max = area;
            }
            if (height[m] <= height[n]) {
                m++;
            } else {
                n--;
            }
            i--;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{4,3,2,1,4}));
    }
}
