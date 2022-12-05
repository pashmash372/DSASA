package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SortedArrayToBalancedBSTTest {

    @Test
    public void sortedArrayToBST() {
        int[] A = {1, 2, 3};
        SortedArrayToBalancedBST s = new SortedArrayToBalancedBST();
        TreeNode root = s.sortedArrayToBST(A);
        List<Integer> list = Arrays.asList(2, 1, 3);
        TreeNode expected = TreeUtils.constructBinaryTree(list);
        Assert.assertEquals(expected, root);
    }

    @Test
    public void sortedArrayToBST1() {
        int[] A = {1, 2, 3, 5, 10};
        SortedArrayToBalancedBST s = new SortedArrayToBalancedBST();
        TreeNode root = s.sortedArrayToBST(A);
        List<Integer> list = Arrays.asList(3, 2, 5, 1, -1, -1, 10, -1, -1, -1, -1);
        TreeNode expected = TreeUtils.constructBinaryTree1(list);
        Assert.assertEquals(expected, root);
    }
}