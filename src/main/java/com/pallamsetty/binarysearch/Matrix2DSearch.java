package com.pallamsetty.binarysearch;

/*
* Leetcode 74
* */

public class Matrix2DSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bot = ROWS - 1;
        while(top <= bot) {
            int row = (top + bot) / 2;
            if(target > matrix[row][COLS - 1]) {
                top = row + 1;
            } else if(target < matrix[row][0]) {
                bot = row - 1;
            } else {
                break;
            }
        }

        if(top > bot) {
            return false;
        }

        int row = (top + bot) / 2;
        int low = 0;
        int high = COLS - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(target > matrix[row][mid]) {
                low = mid + 1;
            } else if(target < matrix[row][mid]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
