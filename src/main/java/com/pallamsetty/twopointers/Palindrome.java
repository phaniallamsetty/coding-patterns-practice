package com.pallamsetty.twopointers;

/*
* Leetcode 125
* */

public class Palindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            char currLeft = s.charAt(left);
            char currRight = s.charAt(right);
            if(!Character.isLetterOrDigit(currLeft)) {
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(currRight)) {
                right--;
                continue;
            }

            char lowerLeft = Character.toLowerCase(currLeft);
            char lowerRight = Character.toLowerCase(currRight);

            if(lowerLeft != lowerRight) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
