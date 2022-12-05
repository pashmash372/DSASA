package com.scaler.dsa.homework;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BSTnodesinarangeTest {

    @Test
    public void solve() {
        BSTnodesinarange b = new BSTnodesinarange();
        List<Integer> list = Arrays.asList(15, 12, 20, 10, 14, 16, 27, 8, null, null, null, null, null, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(list);
        int B = 12;
        int C = 20;
        int ans = b.solve(A, B, C);
        int expected = 5;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        BSTnodesinarange b = new BSTnodesinarange();
        List<Integer> list = Arrays.asList(8, 6, 21, 1, 7, null, null);
        TreeNode A = TreeUtils.constructBinaryTree(list);
        int B = 2;
        int C = 20;
        int ans = b.solve(A, B, C);
        int expected = 3;
        Assert.assertEquals(expected, ans);
    }
}