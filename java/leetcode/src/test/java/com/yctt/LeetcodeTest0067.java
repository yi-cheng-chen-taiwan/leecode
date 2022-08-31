package com.yctt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetcodeTest0067 {
    @Test
    public void testCast1() {
        Assertions.assertEquals(
            "100", 
            new Leetcode0067().addBinary("11", "1"));
        }
    
    @Test
    public void testCast2() {
        Assertions.assertEquals(
            "10101", 
            new Leetcode0067().addBinary("1010", "1011"));
    }
}
