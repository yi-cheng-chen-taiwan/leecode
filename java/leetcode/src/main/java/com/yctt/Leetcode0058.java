package com.yctt;

/** 
 * 58. Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/
 * Easy 
 */ 
public class Leetcode0058 {
    public int lengthOfLastWord(String s) {
        int len = 0;

        for (int pos = s.length() - 1; pos >= 0; pos--) {
            if (' ' == s.charAt(pos)) {
                if (0 != len) {
                    break;
                }
                continue;
            }
            len++;
        }

        return len;
    }
}
