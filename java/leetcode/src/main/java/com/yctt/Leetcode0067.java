package com.yctt;

/** 
 * 67. Add Binary
 * https://leetcode.com/problems/add-binary/
 * Easy 
 */ 
public class Leetcode0067 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int aPos = a.length() - 1;
        int bPos = b.length() - 1;
        int carry = 0;

        while (aPos >= 0 || bPos >= 0) {
            int aVal = aPos >= 0 ? toInteger(a.charAt(aPos--)) : 0;
            int bVal = bPos >= 0 ? toInteger(b.charAt(bPos--)) : 0;

            int sum = aVal + bVal + carry;
            
            result.append(String.valueOf(sum % 2));
            carry = sum / 2;
        }
        
        if (carry > 0) {
            result.append("1");
        }

        return result.reverse().toString();
    }

    private int toInteger(Character c) {
        return c.equals('1') ? 1 : 0;
    }
}
