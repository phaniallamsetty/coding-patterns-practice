package com.pallamsetty.arraysandhashing;

public class ProductOfArrayExceptSelf {
    public int[] getProductOfArrayExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;

        result[0] = 1;

        for(int i = 1; i < n; i++) {
            result[i] = nums[i-1] * result[i-1];
        }

        int postfix = 1;
        for(int i = n - 1; i >= 0; i-- ) {
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
        }

        return result;
    }
}
