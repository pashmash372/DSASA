package com.scaler.homework;

import com.beust.ah.A;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElementsRemovalTest {

    @Test
    void solve() {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 1));
        int expected=4;
        ElementsRemoval e = new ElementsRemoval();
        int ans = e.solve(A);
        assertEquals(expected,ans);
    } @Test
    void solve1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(5));
        int expected=5;
        ElementsRemoval e = new ElementsRemoval();
        int ans = e.solve(A);
        assertEquals(expected,ans);
    }
}