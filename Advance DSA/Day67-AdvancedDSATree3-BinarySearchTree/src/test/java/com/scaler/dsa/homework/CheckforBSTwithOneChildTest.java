package com.scaler.dsa.homework;

import org.junit.Test;

public class CheckforBSTwithOneChildTest {

    @Test
    public void solve() {
        int[] A = {4, 10, 5, 8};
        CheckforBSTwithOneChild c = new CheckforBSTwithOneChild();
        String ans = c.solve(A);
        String expected = "YES";
    }

    @Test
    public void solve1() {
        int[] A = {1, 5, 6, 4};
        CheckforBSTwithOneChild c = new CheckforBSTwithOneChild();
        String ans = c.solve(A);
        String expected = "NO";
    }
}