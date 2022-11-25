package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class SortListTest {

    @Test
    public void sortList() {
        SortList s = new SortList();
        int[] nums1 = {3, 4, 2, 8};
        ListNode A = LinkedListUtils.contructLinkedList(nums1);
        ListNode ans = s.sortList(A);
        int[] nums2 = {2, 3, 4, 8};
        ListNode expected = LinkedListUtils.contructLinkedList(nums2);
        Assert.assertEquals(expected, ans);
    }@Test
    public void sortList1() {
        SortList s = new SortList();
        int[] nums1 = {1};
        ListNode A = LinkedListUtils.contructLinkedList(nums1);
        ListNode ans = s.sortList(A);
        int[] nums2 = {1};
        ListNode expected = LinkedListUtils.contructLinkedList(nums2);
        Assert.assertEquals(expected, ans);
    }
}