package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class InfixtoPostfixTest {

    @Test
    public void solve() {
        String A = "x^y/(a*z)+b";
        InfixtoPostfix i = new InfixtoPostfix();
        String ans = i.solve(A);
        String expected = "xy^az*/b+";
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        String A = "a+b*(c^d-e)^(f+g*h)-i";
        InfixtoPostfix i = new InfixtoPostfix();
        String ans = i.solve(A);
        String expected = "abcd^e-fgh*+^*+i-";
        Assert.assertEquals(expected, ans);
    }

}