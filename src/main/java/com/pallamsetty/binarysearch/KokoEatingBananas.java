package com.pallamsetty.binarysearch;

public class KokoEatingBananas {
    public int getMinEatingSpeedBruteForce(int[] piles, int h) {
        int speed = 1;

        while(true) {
            long totalTime = 0;
            for(int pile: piles) {
                totalTime += (int) Math.ceil((double) pile / speed);
            }

            if(totalTime <= h) {
                return speed;
            }
            speed++;
        }
    }

    public int getMinEatingSpeedBinarySearch(int[] piles, int h) {
        int left = 1;
        int right = getMaxNum(piles);
        int result = right;

        while (left <= right) {
            int mid = (left + right) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += (long) Math.ceil((double) p / mid);
            }
            if (totalTime <= h) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private static int getMaxNum(int[] piles) {
        int max = -1;
        for(int pile: piles) {
            max = Math.max(pile, max);
        }
        return max;
    }
}
