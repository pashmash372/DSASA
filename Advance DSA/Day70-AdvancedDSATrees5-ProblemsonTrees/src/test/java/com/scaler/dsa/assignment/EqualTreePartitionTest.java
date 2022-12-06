package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;
import com.scaler.dsa.common.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EqualTreePartitionTest {

    @Test
    public void solve() {
        List<Integer> list = Arrays.asList(5, 3, 7, 4, 6, 5, 6);
        TreeNode A = TreeUtils.constructBinaryTree(list);
        EqualTreePartition e = new EqualTreePartition();
        int ans = e.solve(A);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        List<Integer> list = Arrays.asList(1,2,10,null,null,20,2);
        TreeNode A = TreeUtils.constructBinaryTree(list);
        EqualTreePartition e = new EqualTreePartition();
        int ans = e.solve(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}