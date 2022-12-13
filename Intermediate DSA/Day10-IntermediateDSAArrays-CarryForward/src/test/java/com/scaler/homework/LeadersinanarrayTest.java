package com.scaler.homework;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeadersinanarrayTest {

    @Test
    void solve() {
//        A = [16, 17, 4, 3, 5, 2]
        ArrayList<Integer> A = new ArrayList<>(List.of(16, 17, 4, 3, 5, 2));
        Leadersinanarray l = new Leadersinanarray();
        ArrayList<Integer> ans = l.solve(A);
        ArrayList<Integer> expected = new ArrayList<>(List.of(17, 2,5));

//        assert two lists for equality ignoring order in java (using apache commons)
        assertTrue(CollectionUtils.isEqualCollection(expected, ans));
    }

}