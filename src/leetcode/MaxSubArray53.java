package leetcode;

public class MaxSubArray53 {
    public static int maxSubArray(int[] nums) {
        int pre = 0, max = nums[0];
        for (int num: nums) {
            pre = Math.max(pre + num, num);
            max = Math.max(pre, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1}));
    }
}
