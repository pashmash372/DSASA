package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        int[] nums1 = {5, 8, 20};
        int[] nums2 = {4, 11, 15};
        ListNode A = LinkedListUtils.contructLinkedList(nums1);
        ListNode B = LinkedListUtils.contructLinkedList(nums2);
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode ans = m.mergeTwoLists(A, B);
        int[] nums3 = {4, 5, 8, 11, 15, 20};
        ListNode expected = LinkedListUtils.contructLinkedList(nums3);
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void mergeTwoLists1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        ListNode A = LinkedListUtils.contructLinkedList(nums1);
        ListNode B = LinkedListUtils.contructLinkedList(nums2);
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode ans = m.mergeTwoLists(A, B);
        int[] nums3 = {1, 2, 3};
        ListNode expected = LinkedListUtils.contructLinkedList(nums3);
        Assert.assertEquals(expected, ans);
    }
}