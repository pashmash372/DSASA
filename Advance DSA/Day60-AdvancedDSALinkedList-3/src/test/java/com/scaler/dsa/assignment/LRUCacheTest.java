package com.scaler.dsa.assignment;

import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void test1() {

        /*   capacity = 2
         set(1, 10)
         set(5, 12)
         get(5)        returns 12
         get(1)        returns 10
         get(10)       returns -1
         set(6, 14)    this pushes out key = 5*/
        LRUCache l = new LRUCache(2);
        l.set(1, 10);
        l.set(5, 12);
        System.out.println(l.get(5));
        System.out.println(l.get(1));
        System.out.println(l.get(10));
        l.set(6, 14);
        System.out.println(l.get(5));
    }
}