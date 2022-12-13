package com.scaler.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmazingSubarraysTest {

    @Test
    void solve() {
        String A="ABEC";
        AmazingSubarrays a = new AmazingSubarrays();
        int ans = a.solve(A);
        int expected =6;

        assertEquals(expected,ans);

    }
}