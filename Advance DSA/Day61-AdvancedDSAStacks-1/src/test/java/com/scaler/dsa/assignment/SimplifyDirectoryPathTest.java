package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class SimplifyDirectoryPathTest {

    @Test
    public void simplifyPath() {
        String A = "/home/";
        SimplifyDirectoryPath s = new SimplifyDirectoryPath();
        String ans = s.simplifyPath(A);
        String expected = "/home";
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void simplifyPath1() {
        String A = "/a/./b/../../c/";
        SimplifyDirectoryPath s = new SimplifyDirectoryPath();
        String ans = s.simplifyPath(A);
        String expected = "/c";
        Assert.assertEquals(expected, ans);
    }
}