package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LetterPhoneTest {

    @Test
    public void letterCombinations() {
        LetterPhone l = new LetterPhone();
        String A = "23";
        ArrayList<String> ans = l.letterCombinations(A);

        /*["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]*/

        ArrayList<String> expected = new ArrayList<>(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void letterCombinations1() {
        LetterPhone l = new LetterPhone();
        String A = "012";
        ArrayList<String> ans = l.letterCombinations(A);

        /* ["01a", "01b", "01c"]*/

        ArrayList<String> expected = new ArrayList<>(List.of("01a", "01b", "01c"));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void letterCombinations2() {
        LetterPhone1 l = new LetterPhone1();
        String A = "23";
        ArrayList<String> ans = l.letterCombinations(A);

        /*["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]*/

        ArrayList<String> expected = new ArrayList<>(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void letterCombinations3() {
        LetterPhone1 l = new LetterPhone1();
        String A = "012";
        ArrayList<String> ans = l.letterCombinations(A);

        /* ["01a", "01b", "01c"]*/

        ArrayList<String> expected = new ArrayList<>(List.of("01a", "01b", "01c"));
        Assert.assertEquals(expected, ans);
    }
}