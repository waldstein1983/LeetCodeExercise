package com.leetcode.problem;

/**
 * Created by baohuaw on 2017/6/5.
 */
public class ReverseString {
    public static String reverseString(String s) {
        String result = "";
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        return result;
    }
}
