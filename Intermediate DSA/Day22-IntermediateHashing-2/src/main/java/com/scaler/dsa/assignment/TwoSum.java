package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    static class Node implements Comparable<Node> {

        int left;
        int right;

        public Node(int left, int right) {
            this.left = left;
            this.right  = right;
        }

        public int compareTo(Node o) {
            if (this.right < o.right)
                return -1;
            if (this.right > o.right)
                return 1;

            return Integer.compare(this.left, o.left);
        }

    }

    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {

        int sum = B;
        int diff;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int size = A.size();
        int num;
        int index;
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Node> node = new ArrayList<>();

        for (int i = size - 1; i >= 0; i--) {
            num = A.get(i);
            diff = sum - num;

            if (hashMap.containsKey(diff)) {
                index = hashMap.get(diff);
                node.add(new Node(i + 1, index + 1));
            }

            hashMap.put(num, i);

        }

        if (node.size() > 0) {
            Collections.sort(node);
            res.add(node.get(0).left);
            res.add(node.get(0).right);
        }

        return res;

    }
}

/*Q4. 2 Sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.

Input: [2, 7, 11, 15], target=9
Output: index1 = 1, index2 = 2*/

/*We use the concept of Hashing.

We initialise an empty dictionary hashdict.
We iterate through the list. If the element is present in hashdict, we return the index of that element in array and the current index.
Otherwise we store it in hashdict. The key is the element and its index is the value.
no pair is found we return [] empty list.
We need to check the cases where the element you are looking up in the map is same as the curValue.

For example, consider the following cases :

A:[4 4] target : 8
and A :[3 4] target : 8

The answer in first case should be [1 2] and in second case, it should be empty.*/