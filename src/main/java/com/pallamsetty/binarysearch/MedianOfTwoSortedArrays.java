package com.pallamsetty.binarysearch;

/*
* Leetcode 4
* */

public class MedianOfTwoSortedArrays {
    public double getMedian(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;

        int total = A.length + B.length;
        int half = (total + 1) / 2;

        if(B.length < A.length) {
            int[] temp = A;
            A = B;
            B = temp;
        }

        int left = 0;
        int right = A.length;
        while(left <= right) {
            int i = left + (right - left) / 2;
            int j = half - i;

            int Aleft = i > 0 ? A[i - 1] : Integer.MIN_VALUE;
            int Aright = i < A.length ? A[i] : Integer.MAX_VALUE;
            int Bleft = j > 0 ? B[j - 1] : Integer.MIN_VALUE;
            int Bright = j < B.length ? B[j] : Integer.MAX_VALUE;

            if(Aleft <= Bright && Bleft <= Aright) {
                if(total % 2 != 0) {
                    return Math.max(Aleft, Bleft);
                }
                return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright))/2.0;
            } else if(Aleft > Bright) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }

        return -1;
    }
}
