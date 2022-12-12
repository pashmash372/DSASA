package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MagicianandChocolatesTest {

    @Test
    public void nchoc() {
        int A = 3;
        int[] B = {6, 5};
        MagicianandChocolates m = new MagicianandChocolates();
        int ans = m.nchoc(A, B);
        int expected = 14;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void nchoc1() {
        int A = 5;
        int[] B = {2, 4, 6, 8, 10};
        MagicianandChocolates m = new MagicianandChocolates();
        int ans = m.nchoc(A, B);
        int expected = 33;
        Assert.assertEquals(expected, ans);
    }
}