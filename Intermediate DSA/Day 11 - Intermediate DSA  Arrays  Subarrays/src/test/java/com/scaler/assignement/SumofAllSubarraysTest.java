package com.scaler.assignement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumofAllSubarraysTest {

    @Test
    void subarraySum() {

//        A = [1, 2, 3]
        SumofAllSubarrays s = new SumofAllSubarrays();
        int[] A = {1, 2, 3};
        long ans = s.subarraySum(A);
        long expected =20;
        assertEquals(expected,ans);
    }
    @Test
    void subarraySum1() {

//        A = [2, 1, 3]
        SumofAllSubarrays s = new SumofAllSubarrays();
        int[] A = {2, 1, 3};
        long ans = s.subarraySum(A);
        long expected =19;
        assertEquals(expected,ans);
    }

}