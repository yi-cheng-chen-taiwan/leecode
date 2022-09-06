package com.yctt;

/**
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 * Easy
 */
public class Leetcode0070 {
    // Recursive version will be over time limit
    // public int climbStairs(int n) {
    //     if (2 >= n) {
    //         return n;
    //     }

    //     return climbStairs(n - 1) + climbStairs(n - 2);
    // }

    public int climbStairs(int n) {
        if (2 >= n) {
            return n;
        }

        int sum = 0;
        int preStair1 = 2, preStair2 = 1;
        for (int count = 3; count <= n; ++count) {
            sum = (preStair1 + preStair2);
            preStair2 = preStair1;
            preStair1 = sum;
        }

        return sum;
    }
}