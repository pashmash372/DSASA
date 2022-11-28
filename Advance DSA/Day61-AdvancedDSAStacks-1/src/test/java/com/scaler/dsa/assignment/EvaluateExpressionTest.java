package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EvaluateExpressionTest {

    @Test
    public void evalRPN() {
        EvaluateExpression e = new EvaluateExpression();
//        A =   ["2", "1", "+", "3", "*"]
        ArrayList<String> A = new ArrayList<>(List.of("2", "1", "+", "3", "*"));
        int ans = e.evalRPN(A);
        int expected = 9;
        Assert.assertEquals(expected, ans);

    }

    @Test
    public void evalRPN1() {
        EvaluateExpression e = new EvaluateExpression();
//        A =   ["2", "1", "+", "3", "*"]
        ArrayList<String> A = new ArrayList<>(List.of("4", "13", "5", "/", "+"));
        int ans = e.evalRPN(A);
        int expected = 6;
        Assert.assertEquals(expected, ans);

    }
}