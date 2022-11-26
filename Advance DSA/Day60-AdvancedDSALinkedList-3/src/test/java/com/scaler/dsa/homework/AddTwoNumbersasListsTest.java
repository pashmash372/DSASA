package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersasListsTest {

    @Test
    public void addTwoNumbers() {
        AddTwoNumbersasLists a = new AddTwoNumbersasLists();
        int[] nums1 = {2, 4, 3};
        int[] nums2 = {5, 6, 4};
        ListNode A = LinkedListUtils.contructLinkedList(nums1);
        ListNode B = LinkedListUtils.contructLinkedList(nums2);
        ListNode ans = a.addTwoNumbers(A, B);

        int[] nums3 = {7, 0, 8};
        ListNode expected = LinkedListUtils.contructLinkedList(nums3);

        Assert.assertEquals(expected, ans);

    }@Test
    public void addTwoNumbers1() {
        AddTwoNumbersasLists a = new AddTwoNumbersasLists();
        int[] nums1 = {9,9};
        int[] nums2 = {1};
        ListNode A = LinkedListUtils.contructLinkedList(nums1);
        ListNode B = LinkedListUtils.contructLinkedList(nums2);
        ListNode ans = a.addTwoNumbers(A, B);

        int[] nums3 = {0,0,1};
        ListNode expected = LinkedListUtils.contructLinkedList(nums3);

        Assert.assertEquals(expected, ans);

    }
}