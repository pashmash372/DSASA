package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ValidBinarySearchTreeTest {

    @Test
    public void isValidBST() {
        List<Integer> l = Arrays.asList(1, 2, 3, null, null, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(l);
        ValidBinarySearchTree v = new ValidBinarySearchTree();
        int ans = v.isValidBST(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void isValidBST1() {
        List<Integer> l = Arrays.asList(2, 1, 3, null, null, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(l);
        ValidBinarySearchTree v = new ValidBinarySearchTree();
        int ans = v.isValidBST(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }
}