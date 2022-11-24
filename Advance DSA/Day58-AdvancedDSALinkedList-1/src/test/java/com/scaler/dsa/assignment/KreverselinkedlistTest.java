package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import junit.framework.TestCase;
import org.junit.Assert;

public class KreverselinkedlistTest extends TestCase {

    public void testReverseList() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int B = 2;
        Kreverselinkedlist k = new Kreverselinkedlist();
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ListNode ans = k.reverseList(A, B);
        int[] nums1 = {2, 1, 4, 3, 6, 5};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }

    public void testReverseList1() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int B = 3;
        Kreverselinkedlist k = new Kreverselinkedlist();
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ListNode ans = k.reverseList(A, B);
        int[] nums1 = {3, 2, 1, 6, 5, 4};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
        Assert.assertEquals(expected, ans);
    }
}