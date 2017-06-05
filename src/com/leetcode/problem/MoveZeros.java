package com.leetcode.problem;

/**
 * Created by baohuaw on 2017/6/5.
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        //two pointers
        //if position j is 0, j++
        //if position j is not 0, make the element of the position i to current value and i++
        //after all, all non-zero elements is moved to front, and if i is not at the last position of the
        //array, make other elements 0
        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
            } else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
