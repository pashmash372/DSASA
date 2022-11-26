package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;
import com.scaler.dsa.common.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeListTest {

    @Test
    public void lPalin() {
        int [] nums={1,2,2,1};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        PalindromeList p = new PalindromeList();
        int ans = p.lPalin(A);
        int expected=1;
        Assert.assertEquals(expected,ans);
    } @Test
    public void lPalin1() {
        int [] nums={1,3,2};
        ListNode A = LinkedListUtils.contructLinkedList(nums);
        PalindromeList p = new PalindromeList();
        int ans = p.lPalin(A);
        int expected=0;
        Assert.assertEquals(expected,ans);
    }
}