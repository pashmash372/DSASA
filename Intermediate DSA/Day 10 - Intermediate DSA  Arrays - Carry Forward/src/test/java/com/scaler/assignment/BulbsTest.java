package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BulbsTest {

    @Test
    void bulbs() {
//        A = [0, 1, 0, 1]
        ArrayList<Integer> A = new ArrayList<>(List.of(0, 1, 0, 1));
        Bulbs b = new Bulbs();
        int ans = b.bulbs(A);
        int expected=4;
        assertEquals(expected,ans);
    }

    @Test
    void bulbs1() {
//        A = [1, 1, 1, 1]
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 1, 1, 1));
        Bulbs b = new Bulbs();
        int ans = b.bulbs(A);
        int expected=0;
        assertEquals(expected,ans);
    }
}