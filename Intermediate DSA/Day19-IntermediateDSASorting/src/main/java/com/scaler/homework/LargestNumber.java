package com.scaler.homework;

import java.util.Arrays;
import java.util.List;

public class LargestNumber {
    // DO NOT MODIFY THE LIST
    public String largestNumber(final List < Integer > A) {
        StringBuffer strBuf = new StringBuffer();
        Node num[];
        int i = 0;
        num = new Node[A.size()];
        for (int n: A) {
            num[i] = new Node(n);
            i++;
        }
        // sorts the array lexicographically
        Arrays.sort(num);
        for (Node n: num) {
            if (n.number == 0 && strBuf.length() != 0)
                continue;
            strBuf.append(n.number);
        }
        return strBuf.toString();
    }
    class Node implements Comparable < Node > {
        int number;
        public Node(int number) {
            this.number = number;
        }
        @Override
        public int compareTo(Node o) {
            String first = String.valueOf(this.number) + String.valueOf(o.number);
            String second = String.valueOf(o.number) + String.valueOf(this.number);
            return second.compareTo(first);
        }
    }
}


/*Q1. Largest Number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.



Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109



Input Format
The first argument is an array of integers.



Output Format
Return a string representing the largest number.



Example Input
Input 1:

 A = [3, 30, 34, 5, 9]
Input 2:

 A = [2, 3, 9, 0]


Example Output
Output 1:

 "9534330"
Output 2:

 "9320"


Example Explanation
Explanation 1:

Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:

Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.*/