package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class KthSmallestElementInBSTTest {

    @Test
    public void kthsmallest() {
        KthSmallestElementInBST k = new KthSmallestElementInBST();
        List<Integer> list = Arrays.asList(24, 18, 32, 10, 20, 28, 34);
        TreeNode A = TreeUtils.constructBinaryTree(list);
        int B = 3;
        int ans = k.kthsmallest(A, B);
        int expected = 20;
        Assert.assertEquals(expected, ans);
    }
}