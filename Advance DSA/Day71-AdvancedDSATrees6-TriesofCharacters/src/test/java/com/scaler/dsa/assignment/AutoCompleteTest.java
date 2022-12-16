package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class AutoCompleteTest {

    @Test
    public void solve() throws FileNotFoundException {

        File source = new File("test.txt");
        System.out.println(source.getAbsolutePath());
        Scanner sc = new Scanner(source);
        Assert.assertTrue(sc.hasNext());
        Assert.assertEquals("Hello", sc.next());
        Assert.assertEquals("World", sc.next());
    }

    @Test
    public void solve1() throws FileNotFoundException {
        String[] args = null;
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream("test.txt");
        System.setIn(fips);
        AutoComplete.main(args);
        System.setIn(original);
    }

    @Test
    public void solve2() throws FileNotFoundException {
        String[] args = null;
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream("test1.txt");
        System.setIn(fips);
        AutoComplete.main(args);
        System.setIn(original);
    }

}