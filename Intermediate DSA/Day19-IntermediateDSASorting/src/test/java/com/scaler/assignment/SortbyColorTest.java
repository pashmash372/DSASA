package com.scaler.assignment;

import com.beust.ah.A;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortbyColorTest {

    @Test
    void sortColors() {
        ArrayList<Integer> A = new ArrayList<>(List.of(0 ,1 ,2 ,0 ,1, 2));
        SortbyColor s = new SortbyColor();
        ArrayList<Integer> ans = s.sortColors(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 0, 1, 1, 2, 2));
        assertTrue(expected.equals(ans));
    }@Test
    void sortColors1() {
        ArrayList<Integer> A = new ArrayList<>(List.of(0));
        SortbyColor s = new SortbyColor();
        ArrayList<Integer> ans = s.sortColors(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0));
        assertTrue(expected.equals(ans));
    }
}