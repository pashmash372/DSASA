package com.scaler.dsa.homework;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeBinaryTreeTest {

    @Test
    public void solve() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, null, null, null, null, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(l);
        SerializeBinaryTree s = new SerializeBinaryTree();
        ArrayList<Integer> ans = s.solve(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, null, 6, null, null, null, null, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(l);
        SerializeBinaryTree s = new SerializeBinaryTree();
        ArrayList<Integer> ans = s.solve(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1));
        Assert.assertEquals(expected, ans);
    }
}