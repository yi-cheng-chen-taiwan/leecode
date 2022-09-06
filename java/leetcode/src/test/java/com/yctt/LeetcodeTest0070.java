package com.yctt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetcodeTest0070 {
    @Test
    public void testCase1() {
        Assertions.assertEquals(
            2, 
            new Leetcode0070().climbStairs(2));
    }

    @Test
    public void testCase2() {
        Assertions.assertEquals(
            3, 
            new Leetcode0070().climbStairs(3));
    }

    @Test
    public void testCase3() {
        Assertions.assertEquals(
            5, 
            new Leetcode0070().climbStairs(4));
    }
}
