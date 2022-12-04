package com.scaler.dsa.homework;

import com.scaler.dsa.TreeNode;
import com.scaler.dsa.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostorderTraversalTest {

    @Test
    public void postorderTraversal() {
        PostorderTraversal p = new PostorderTraversal();
        List<Integer> l = Arrays.asList(1, null, 2, 3, null, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(l);
        ArrayList<Integer> ans = p.postorderTraversal(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(3, 2, 1));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void postorderTraversal1() {
        PostorderTraversal p = new PostorderTraversal();
        List<Integer> l = Arrays.asList(1, 6, 2, null, null, 3, null, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(l);
        ArrayList<Integer> ans = p.postorderTraversal(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(6, 3, 2, 1));
        Assert.assertEquals(expected, ans);
    }
}