package com.scaler.dsa.homework;

import junit.framework.TestCase;
import org.junit.Assert;

public class ModifiedSearchTest extends TestCase {

    public void testSolve() {
        String[] A = {"data", "circle", "cricket"};
        String[] B = {"date", "circel", "crikket", "data", "circl"};

        String expected = "10100";
        ModifiedSearch m = new ModifiedSearch();
        String ans = m.solve(A, B);
        Assert.assertEquals(expected, ans);
    }

    public void testSolve1() {
        String[] A = {"hello", "world"};
        String[] B = {"hella", "pello", "pella"};

        String expected = "110";
        ModifiedSearch m = new ModifiedSearch();
        String ans = m.solve(A, B);
        Assert.assertEquals(expected, ans);
    }
}