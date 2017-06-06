package com.leetcode.problem;

/**
 * Created by baohuaw on 2017/6/6.
 */
public class ExcelSheetColumnNumber {
    public String convertToTitle(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input is not valid!");
        }

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;
            char ch = (char) (n % 26 + 'A');
            n /= 26;
            sb.append(ch);
        }

        sb.reverse();
        return sb.toString();
    }
}
