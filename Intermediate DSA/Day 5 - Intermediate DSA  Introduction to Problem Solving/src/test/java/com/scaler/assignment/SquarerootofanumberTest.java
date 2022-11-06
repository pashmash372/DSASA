package com.scaler.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquarerootofanumberTest {


    /*Input 1:
A = 4
Input 2:

A = 1001
Example Output

Output 1:
2
Output 2:

-1*/
    @Test
    public void solve() {
        int A=4;
        int expected =2;
        Squarerootofanumber s = new Squarerootofanumber();
        int ans = s.solve(A);
        assertEquals(expected,ans);

    }
    @Test
    public void solve1() {
        int A=1001;
        int expected =-1;
        Squarerootofanumber s = new Squarerootofanumber();
        int ans = s.solve(A);
        assertEquals(expected,ans);

    }
}

