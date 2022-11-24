package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkListIITest {

    @Test
    public void reverseBetween() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        int B = 2;
        int C = 4;
        ReverseLinkListII r = new ReverseLinkListII();
        ListNode ans = r.reverseBetween(A, B, C);
        int[] nums1 = {1, 4, 3, 2, 5};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void reverseBetween1() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        int B = 1;
        int C = 5;
        ReverseLinkListII r = new ReverseLinkListII();
        ListNode ans = r.reverseBetween(A, B, C);
        int[] nums1 = {5, 4, 3, 2, 1};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }
}