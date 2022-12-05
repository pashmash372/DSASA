package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeFromInorderAndPostorderTest {

    @Test
    public void buildTree() {
        ArrayList<Integer> A = new ArrayList<>(List.of(6, 1, 3, 2));
        ArrayList<Integer> B = new ArrayList<>(List.of(6, 3, 2, 1));

        BinaryTreeFromInorderAndPostorder b = new BinaryTreeFromInorderAndPostorder();
        TreeNode t = b.buildTree(A, B);
        List<Integer> l = Arrays.asList(1, 6, 2, null, null, 3, null);
//        List<Integer> l = List.of(1, 6, 2, null, null, 3, null);  /*List.of() will give  NPE */
        TreeNode expected = TreeUtils.constructBinaryTree(l);
        Assert.assertEquals(expected, t);
    }

    @Test
    public void buildTree1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(4, 8, 2, 5, 1, 6, 3, 7));
        ArrayList<Integer> B = new ArrayList<>(List.of(8, 4, 5, 2, 6, 7, 3, 1));

        BinaryTreeFromInorderAndPostorder b = new BinaryTreeFromInorderAndPostorder();
        TreeNode t = b.buildTree(A, B);
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, null, 8, null, null, null, null, null, null, null, null);
//        List<Integer> l = List.of(1, 6, 2, null, null, 3, null);  /*List.of() will give  NPE */
        TreeNode expected = TreeUtils.constructBinaryTree(l);
        Assert.assertEquals(expected, t);
    }
}