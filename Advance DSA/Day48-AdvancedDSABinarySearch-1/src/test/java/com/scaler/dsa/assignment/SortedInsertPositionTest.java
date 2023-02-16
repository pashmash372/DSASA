package com.scaler.dsa.assignment;

import org.junit.Test;

import java.util.*;

class MyKey {
    private final String name;
    private final int id;

    public MyKey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

//        System.out.println("Calling equals() for key: " + o);

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return id == myKey.id && Objects.equals(name, myKey.name);
    }

    @Override
    public int hashCode() {
//        System.out.println("Calling hashCode()");
        return id;
    }

    @Override
    public String toString() {
        return "MyKey{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}

public class SortedInsertPositionTest {

    @Test
    public void whenCallsEqualsOnCollision_thenCorrect() {
        HashMap<MyKey, String> map = new HashMap<>();
        MyKey k1 = new MyKey(1, "firstKey");
        MyKey k2 = new MyKey(2, "secondKey");
        MyKey k3 = new MyKey(2, "thirdKey");

        map.put(k1, "firstValue");
        map.put(k2, "secondValue");
        map.put(k3, "thirdValue");
        map.put(k3, "fourth");
        map.put(k3, "fourth1");
        map.put(k3, "fourth2");
        map.put(k3, "fourth3");
        map.put(k3, "fourth4");
        map.put(k3, "fourth4");
        map.put(k3, "fourth5");
        map.put(k3, "fourth6");



        Set<Map.Entry<MyKey, String>> entries = map.entrySet();

        for (Map.Entry<MyKey, String> entry : map.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());
        }
        String s = map.get(k3);
        System.out.println(s);

        Collection<String> values = map.values();
        System.out.println(values);



    }
}