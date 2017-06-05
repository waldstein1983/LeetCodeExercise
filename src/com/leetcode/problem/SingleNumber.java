package com.leetcode.problem;

/**
 * Created by baohuaw on 2017/6/5.
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        int x = 0;
        for (int a : A) {
            x = x ^ a;
        }
        return x;
    }
}
