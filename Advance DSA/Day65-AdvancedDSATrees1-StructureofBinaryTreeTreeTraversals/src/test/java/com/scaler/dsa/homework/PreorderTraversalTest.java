package com.scaler.dsa.homework;

import com.scaler.dsa.TreeNode;
import com.scaler.dsa.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreorderTraversalTest {

    @Test
    public void preorderTraversal() {
        PreorderTraversal p = new PreorderTraversal();
        List<Integer> l = Arrays.asList(1, null, 2, 3, null, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(l);
        ArrayList<Integer> ans = p.preorderTraversal(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 2, 3));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void preorderTraversal1() {
        PreorderTraversal p = new PreorderTraversal();
        List<Integer> l = Arrays.asList(1, 6, 2, null, null, 3, null, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(l);
        ArrayList<Integer> ans = p.preorderTraversal(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 6, 2, 3));
        Assert.assertEquals(expected, ans);
    }
}