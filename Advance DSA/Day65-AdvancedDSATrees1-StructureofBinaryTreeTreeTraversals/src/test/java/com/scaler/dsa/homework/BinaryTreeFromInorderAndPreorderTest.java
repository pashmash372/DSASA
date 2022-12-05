package com.scaler.dsa.homework;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeFromInorderAndPreorderTest {

    @Test
    public void buildTree() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> B = new ArrayList<>(List.of(2, 1, 3));

        BinaryTreeFromInorderAndPreorder b = new BinaryTreeFromInorderAndPreorder();
        TreeNode t = b.buildTree(A, B);
        List<Integer> l = Arrays.asList(1, 2, 3, null, null, null, null);
        TreeNode expected = TreeUtils.constructBinaryTree(l);
        Assert.assertEquals(expected, t);
    }

    @Test
    public void buildTree1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 6, 2, 3));
        ArrayList<Integer> B = new ArrayList<>(List.of(6, 1, 3, 2));

        BinaryTreeFromInorderAndPreorder b = new BinaryTreeFromInorderAndPreorder();
        TreeNode t = b.buildTree(A, B);
        List<Integer> l = Arrays.asList(1, 6, 2, null, null, 3, null, null, null);
        TreeNode expected = TreeUtils.constructBinaryTree(l);
        Assert.assertEquals(expected, t);
    }
}