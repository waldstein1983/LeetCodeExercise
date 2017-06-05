package com.leetcode.problem;

/**
 * Created by baohuaw on 2017/6/5.
 */
public class SumOfTwoIntegers {

    public static void main(String[] args){
        SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();
        int result = sumOfTwoIntegers.getSum(5,6);
        System.out.println(result);
    }

    int getSum(int a, int b) {
        while (b > 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
