package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesfromSortedListTest {

    @Test
    public void deleteDuplicates() {
        RemoveDuplicatesfromSortedList r = new RemoveDuplicatesfromSortedList();
        int[] nums = {1, 1, 2};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ListNode ans = r.deleteDuplicates(A);
        int[] nums1 = {1, 2};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void deleteDuplicates1() {
        RemoveDuplicatesfromSortedList r = new RemoveDuplicatesfromSortedList();
        int[] nums = {1, 1, 2, 3, 3};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ListNode ans = r.deleteDuplicates(A);
        int[] nums1 = {1, 2, 3};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }
}