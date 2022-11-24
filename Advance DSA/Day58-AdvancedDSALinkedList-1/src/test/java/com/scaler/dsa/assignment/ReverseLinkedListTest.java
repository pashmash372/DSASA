package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ReverseLinkedList r = new ReverseLinkedList();
        ListNode ans = r.reverseList(A);
        int[] nums1 = {5, 4, 3, 2, 1};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void reverseList1() {
        int[] nums = {3};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ReverseLinkedList r = new ReverseLinkedList();
        ListNode ans = r.reverseList(A);
        int[] nums1 = {3};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }

}