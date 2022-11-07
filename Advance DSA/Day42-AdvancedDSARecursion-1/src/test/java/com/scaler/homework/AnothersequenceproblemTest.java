package com.scaler.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnothersequenceproblemTest {

    @Test
    public void solve() {
        Anothersequenceproblem a = new Anothersequenceproblem();
        int A = 3;
        int expected = 7;
        int ans = a.solve(A);
        assertEquals(expected, ans);
    } @Test
    public void solve1() {
        Anothersequenceproblem a = new Anothersequenceproblem();
        int A = 2;
        int expected = 2;
        int ans = a.solve(A);
        assertEquals(expected, ans);
    }
}