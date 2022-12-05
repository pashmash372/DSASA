package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalTest {

    @Test
    public void inorderTraversal() {
        InorderTraversal i = new InorderTraversal();
        TreeNode t = new TreeNode(1);
        t.right = new TreeNode(2);
        t.right.left = new TreeNode(3);
        ArrayList<Integer> ans = i.inorderTraversal(t);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 3, 2));
        Assert.assertEquals(expected, ans);

    }

    @Test
    public void inorderTraversal1() {
        InorderTraversal i = new InorderTraversal();
        TreeNode t = new TreeNode(10);
        t.left = new TreeNode(8);
        t.right = new TreeNode(13);
        t.left.left = new TreeNode(6);
        t.left.right = new TreeNode(9);
        t.right.left = new TreeNode(11);
        t.right.right = new TreeNode(15);
        ArrayList<Integer> ans = i.inorderTraversal(t);
        ArrayList<Integer> expected = new ArrayList<>(List.of(6, 8, 9, 10, 11, 13, 15));
        Assert.assertEquals(expected, ans);

    }
}