package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class ReorderListTest {

    @Test
    public void reorderList() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ReorderList r = new ReorderList();
        ListNode ans = r.reorderList(A);
        int[] nums1 = {1, 5, 2, 4, 3};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void reorderList1() {
        int[] nums = {1, 2, 3, 4};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ReorderList r = new ReorderList();
        ListNode ans = r.reorderList(A);
        int[] nums1 = {1, 4, 2, 3};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }
}