package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllocateBooksTest {

    @Test
    public void books() {
        ArrayList<Integer> A = new ArrayList<>(List.of(12, 34, 67, 90));
        int B = 2;
        AllocateBooks a = new AllocateBooks();
        int ans = a.books(A, B);
        int expected = 113;
        Assert.assertEquals(expected, ans);

    }
}