package com.yctt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetcodeTest0121 {
    @Test
    public void testCase1() {
        Assertions.assertEquals(
            5, 
            new Leetcode0121().maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void testCase2() {
        Assertions.assertEquals(
            0, 
            new Leetcode0121().maxProfit(new int[] {7, 6, 4, 3, 1}));
    }
}
