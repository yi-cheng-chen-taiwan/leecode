package com.yctt;

/** 
 * 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 * Easy 
 */ 
public class Leetcode0035 {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    private int searchInsert(int[] nums, int target, int left, int right) {
        if (1 >= right - left) {
            if (target < nums[left]) {
                return Math.max(0, left - 1); 
            } else if (target == nums[left]) {
                return left;
            } else if (target < nums[right]) {
                return right;
            } else if (target == nums[right]) {
                return right;
            } else {
                return right + 1;
            }
        } 

        int mid = (left + right) / 2;
        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]){
            return searchInsert(nums, target, left, mid);
        } else {
            return searchInsert(nums, target, mid, right);
        }
    }
}
