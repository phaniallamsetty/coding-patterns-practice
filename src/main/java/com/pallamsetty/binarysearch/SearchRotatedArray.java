package com.pallamsetty.binarysearch;

public class SearchRotatedArray {
    public int searchBruteForce(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int searchBinary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            // We are using left <= right instead of left < right,
            // to account for the case where there is only one element in the array.

            int mid = left + (right - left) / 2;
            // We are using left + (right - left) / 2 instead of (left +  right) / 2
            // in order to prevent an integer value overflow.
            // Ex: if left = Integer.MAX_VALUE - 1 and right = Integer.MAX_VALUE,
            // mid will involve first adding left and right and then getting the half of it.
            // The addition will fail since it will go over the permitted integer value.
            // If we use left + (right - left) / 2, we are subtracting and going away from the
            // overflow.
            // For smaller values of left and right, it makes no difference.

            if(target == nums[mid]) {
                return mid;
            }

            // We need to check if  we are in the left sorted portion or the right.
            if(nums[left] <= nums[mid]) {
                // Left sorted portion
                if(target > nums[mid] || target < nums[left]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                // Right sorted portion
                if(target < nums[mid] || target > nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}
