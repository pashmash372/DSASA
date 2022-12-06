package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class InverttheBinaryTreeTest {

    @Test
    public void solve() {

        List<Integer> list = Arrays.asList(1, 2, 3);
        TreeNode A = TreeUtils.constructBinaryTree(list);
        InverttheBinaryTree i = new InverttheBinaryTree();
        TreeNode ans = i.invertTree(A);

        List<Integer> list1 = Arrays.asList(1, 3, 2);
        TreeNode expected = TreeUtils.constructBinaryTree(list1);

        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        TreeNode A = TreeUtils.constructBinaryTree(list);
        InverttheBinaryTree i = new InverttheBinaryTree();
        TreeNode ans = i.invertTree(A);

        List<Integer> list1 = Arrays.asList(1, 3, 2, 7, 6, 5, 4);
        TreeNode expected = TreeUtils.constructBinaryTree(list1);

        Assert.assertEquals(expected, ans);
    }

}