package com.yctt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; 

public class LeetcodeTest0035 {
    @Test
    void testCase1() {
        Assertions.assertEquals(
            2, 
            new Leetcode0035().searchInsert(new int[] {1, 3, 5, 6}, 5));
    }

    @Test
    void testCase2() {
        Assertions.assertEquals(
            1, 
            new Leetcode0035().searchInsert(new int[] {1, 3, 5, 6}, 2));
    }

    @Test
    void testCase3() {
        Assertions.assertEquals(
            4, 
            new Leetcode0035().searchInsert(new int[] {1, 3, 5, 6}, 7));
    }

    @Test
    void testCase4() {
        Assertions.assertEquals(
            0, 
            new Leetcode0035().searchInsert(new int[] {1, 3}, 0));
    }

    @Test
    void testCase5() {
        Assertions.assertEquals(
            3, 
            new Leetcode0035().searchInsert(new int[] {3, 5, 7, 9, 10}, 8));
    }
}