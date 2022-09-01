package com.yctt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.yctt.Leetcode0083.ListNode;

public class LeetcodeTest0083 {
    @Test
    public void testCase1() {
        ListNode input = createListNodes(new int[] {1, 1, 2});

        Assertions.assertTrue(checkListNodesEquals(
            createListNodes(new int[] {1, 2}), 
            new Leetcode0083().deleteDuplicates(input)));
    }

    @Test
    public void testCase2() {
        ListNode input = createListNodes(new int[] {1, 1, 2, 3, 3});

        Assertions.assertTrue(checkListNodesEquals(
            createListNodes(new int[] {1, 2, 3}), 
            new Leetcode0083().deleteDuplicates(input)));
    }

    private ListNode createListNodes(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; ++i) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    private boolean checkListNodesEquals(ListNode expected, ListNode real) {
        while (null != expected && null != real) {
            if (expected.val != real.val) {
                return false;
            }

            expected = expected.next;
            real = real.next;
        }

        return expected == real;
    }
}
