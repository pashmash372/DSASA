package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class SeatsTest {

    @Test
    public void solve() {
        String A = "....x..xx...x..";
        Seats s = new Seats();
        int ans = s.seats(A);
        int expected = 5;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "....xxx";
        Seats s = new Seats();
        int ans = s.seats(A);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}