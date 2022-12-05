package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LargestBSTSubtreeTest {

    @Test
    public void solve() {
        List<Integer> list = Arrays.asList(10, 5, 15, 1, 8, null, 7);
        TreeNode A = TreeUtils.constructBinaryTree(list);
        LargestBSTSubtree l = new LargestBSTSubtree();
        int ans = l.largestBST(A);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        List<Integer> list = Arrays.asList(5, 3, 8, 1, 4, 7, 9);
        TreeNode A = TreeUtils.constructBinaryTree(list);
        LargestBSTSubtree l = new LargestBSTSubtree();
        int ans = l.largestBST(A);
        int expected = 7;
        Assert.assertEquals(expected, ans);
    }
}