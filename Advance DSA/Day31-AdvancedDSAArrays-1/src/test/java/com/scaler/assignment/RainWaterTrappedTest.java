package com.scaler.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class RainWaterTrappedTest {

    private int []A={0, 1, 0, 2};
    private  int expectedA=1;

    private int []B = {1, 2};
    private int expectedB=0;

    private int []C={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    private int expectedC=6;

    @Test
    public void trap() {
        RainWaterTrapped r = new RainWaterTrapped();
        int trap = r.trap(A);
        assertEquals("FAILED",trap,expectedA);
    }
    @Test
    public void trap1() {
        RainWaterTrapped r = new RainWaterTrapped();
        int trap = r.trap(B);
        assertEquals("FAILED",trap,expectedB);
    }

    @Test
    public void trap2() {
        RainWaterTrapped r = new RainWaterTrapped();
        int trap = r.trap(C);
        assertEquals("FAILED",trap,expectedC);
    }

}