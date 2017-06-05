package com.leetcode.problem;

/**
 * Created by baohuaw on 2017/6/5.
 */
public class MaximumDepthofBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int maxDepth(TreeNode root) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        if (root == null)
            return 0;
        int lmax = maxDepth(root.left);
        int rmax = maxDepth(root.right);
        return Math.max(lmax, rmax) + 1;
    }

}
