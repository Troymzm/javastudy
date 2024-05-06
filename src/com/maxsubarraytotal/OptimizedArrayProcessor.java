package com.maxsubarraytotal;

/**
 * @author mzm
 * @version 1.0
 */
public class OptimizedArrayProcessor implements ArrayProcessor{
    @Override
    public int maxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
