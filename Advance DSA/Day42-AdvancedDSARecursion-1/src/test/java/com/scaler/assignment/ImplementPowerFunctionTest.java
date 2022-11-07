package com.scaler.assignment;

import junit.framework.TestCase;

public class ImplementPowerFunctionTest extends TestCase {

    public void test() {


        ImplementPowerFunction.Solution1 i= new ImplementPowerFunction.Solution1();

        int A = 2, B = 3, C = 3;
        int ans = i.pow(A, B, C);
        int expected = 2;
        assertEquals(expected, ans);
    } public void test1() {


        ImplementPowerFunction.Solution1 i= new ImplementPowerFunction.Solution1();

        int A=71045970,B= 41535484,C=64735492;
        int ans = i.pow(A, B, C);
        int expected = 20805472;
        assertEquals(expected, ans);
    }

    public void test2() {


        ImplementPowerFunction.Solution2 i= new ImplementPowerFunction.Solution2();

        int A = 2, B = 3, C = 3;
        int ans = i.pow(A, B, C);
        int expected = 2;
        assertEquals(expected, ans);
    } public void test3() {


        ImplementPowerFunction.Solution2 i= new ImplementPowerFunction.Solution2();

        int A=71045970,B= 41535484,C=64735492;
        int ans = i.pow(A, B, C);
        int expected = 20805472;
        assertEquals(expected, ans);
    }

}