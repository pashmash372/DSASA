package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class DeletemiddlenodeofaLinkedListTest {

    @Test
    public void solve() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ListNode ans = DeletemiddlenodeofaLinkedList.solve(A);
        int[] nums1 = {1, 2, 4, 5};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
//        System.out.println(expected.equals(ans));
        Assert.assertEquals(expected, ans);

    }

    @Test
    public void solve1() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        ListNode ans = DeletemiddlenodeofaLinkedList.solve(A);
        int[] nums1 = {1, 2, 3, 5, 6};
        ListNode expected = LinkedListUtils.contructLinkedList(nums1);
//        System.out.println(expected.equals(ans));
        Assert.assertEquals(expected, ans);

    }

}