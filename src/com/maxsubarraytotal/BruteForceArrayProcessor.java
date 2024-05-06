package com.maxsubarraytotal;

/**
 * @author mzm
 * @version 1.0
 */
public class BruteForceArrayProcessor implements ArrayProcessor{
    @Override
    public int maxSubArraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
