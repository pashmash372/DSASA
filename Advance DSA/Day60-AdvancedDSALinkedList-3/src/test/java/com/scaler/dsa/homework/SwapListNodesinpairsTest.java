package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class SwapListNodesinpairsTest {

    @Test
    public void swapPairs() {
        int[] nums1 = {1, 2, 3, 4};
        ListNode A = LinkedListUtils.contructLinkedList(nums1);

        SwapListNodesinpairs s = new SwapListNodesinpairs();
        ListNode ans = s.swapPairs(A);

        int[] nums2 = {2, 1, 4, 3};
        ListNode expected = LinkedListUtils.contructLinkedList(nums2);

        Assert.assertEquals(expected, ans);

    }

    @Test
    public void swapPairs1() {
        int[] nums1 = {7, 2, 1};
        ListNode A = LinkedListUtils.contructLinkedList(nums1);

        SwapListNodesinpairs s = new SwapListNodesinpairs();
        ListNode ans = s.swapPairs(A);

        int[] nums2 = {2, 7, 1};
        ListNode expected = LinkedListUtils.contructLinkedList(nums2);

        Assert.assertEquals(expected, ans);

    }
}