package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

public class MiddleelementoflinkedlistTest {

    @Test
    public void solve() {
        Middleelementoflinkedlist m = new Middleelementoflinkedlist();
        int[] nums = {1, 2, 3, 4, 5};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        int ans = m.solve(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        Middleelementoflinkedlist m = new Middleelementoflinkedlist();
        int[] nums = {1, 5, 6, 2, 3, 4};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        int ans = m.solve(A);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }
}