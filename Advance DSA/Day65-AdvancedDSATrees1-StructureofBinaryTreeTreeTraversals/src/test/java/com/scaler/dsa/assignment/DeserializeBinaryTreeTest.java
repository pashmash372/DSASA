package com.scaler.dsa.assignment;

import com.scaler.dsa.TreeNode;
import com.scaler.dsa.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeserializeBinaryTreeTest {

    @Test
    public void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1));
        DeserializeBinaryTree d = new DeserializeBinaryTree();
        TreeNode ans = d.solve(A);
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, null, null, null, null, null, null);
        TreeNode expected = TreeUtils.constructBinaryTree(l);
        Assert.assertEquals(expected, ans);

    }

    @Test
    public void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1));
        DeserializeBinaryTree d = new DeserializeBinaryTree();
        TreeNode ans = d.solve(A);
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, null, 6, null, null, null, null, null, null);
        TreeNode expected = TreeUtils.constructBinaryTree(l);
        Assert.assertEquals(expected, ans);

    }
}