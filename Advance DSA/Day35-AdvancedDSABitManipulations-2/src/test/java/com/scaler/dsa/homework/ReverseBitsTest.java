package com.scaler.dsa.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBitsTest {

    @Test
    public  void solve(){
        ReverseBits r= new ReverseBits();
        long A=3;
        long reverse = r.reverse(A);
        System.out.println(reverse);
    }

}