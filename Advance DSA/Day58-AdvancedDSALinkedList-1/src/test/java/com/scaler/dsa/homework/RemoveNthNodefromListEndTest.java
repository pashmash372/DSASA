package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class RemoveNthNodefromListEndTest {

    @Test
    public void removeNthFromEnd() {
        int[] nums = {1, 2, 3, 4, 5};
        int B = 2;
        RemoveNthNodefromListEnd r = new RemoveNthNodefromListEnd();
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ListNode ans = r.removeNthFromEnd(A, B);
        int[] nums1 = {1, 2, 3, 5};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void removeNthFromEnd1() {
        int[] nums = {1};
        int B = 1;
        RemoveNthNodefromListEnd r = new RemoveNthNodefromListEnd();
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ListNode ans = r.removeNthFromEnd(A, B);
        int[] nums1 = {};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }
}