package com.yctt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; 

public class LeetcodeTest0058 {

    @Test
    void testCase1() {
        Assertions.assertEquals(
            5, 
            new Leetcode0058().lengthOfLastWord("Hello World"));
    }
    
    @Test
    void testCase2() {
        Assertions.assertEquals(
            4, 
            new Leetcode0058().lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void testCase3() {
        Assertions.assertEquals(
            6, 
            new Leetcode0058().lengthOfLastWord("luffy is still joyboy"));
    }
}
