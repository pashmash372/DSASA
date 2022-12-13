package com.scaler.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductarraypuzzleTest {


    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        Productarraypuzzle p = new Productarraypuzzle();
        int[] ans = p.solve(A);
        int[] expected = {120, 60, 40, 30, 24};

        assertArrayEquals(expected, ans);

    }

    @Test
    public void solve1() {
        int[] A = {5, 1, 10, 1};
        Productarraypuzzle p = new Productarraypuzzle();
        int[] ans = p.solve(A);
        int[] expected = {10, 50, 5, 50};

        assertArrayEquals(expected, ans);

    }
}

/*Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [120, 60, 40, 30, 24]

Input 2:
    A = [5, 1, 10, 1]
Output 2:
    [10, 50, 5, 50]*/