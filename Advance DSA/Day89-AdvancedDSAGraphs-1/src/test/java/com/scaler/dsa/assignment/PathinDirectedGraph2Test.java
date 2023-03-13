package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class PathinDirectedGraph2Test {

    @Test
    public void solve() {

        int A = 5;
        int[][] B = {{1, 4}, {2, 1}, {4, 3}, {4, 5}, {2, 3}, {2, 4}, {1, 5}, {5, 3}, {2, 5}, {5, 1}, {4, 2}, {3, 1}, {5, 4}, {3, 4}, {1, 3}, {4, 1}, {3, 5}, {3, 2}, {5, 2}};
        PathinDirectedGraph2 p = new PathinDirectedGraph2();
        int ans = p.solve(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

}