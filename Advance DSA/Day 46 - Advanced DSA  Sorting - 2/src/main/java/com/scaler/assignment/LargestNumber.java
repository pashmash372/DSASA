package com.scaler.assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

    static class Solution1 {
        public String largestNumber(final List<Integer> A) {
            StringBuffer strBuff = new StringBuffer();
            Node num[];
            int i = 0;
            num = new Node[A.size()];
            for (int n : A) {
                num[i] = new Node(n);
                i++;
            }
            Arrays.sort(num);
            for (Node n : num) {
                if (n.number == 0 && strBuff.length() != 0) continue;
                strBuff.append(n.number);
            }
            return strBuff.toString();
        }

        class Node implements Comparable<Node> {

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

    static class Solution2 {
        public String largestNumber(final int[] A) {
            int N = A.length;

            StringBuilder sb = new StringBuilder();
            String[] str = new String[N];

            for(int i = 0; i < N; i++) {
                str[i] = Integer.toString(A[i]);    //Converting the integer elements of array A to string elements.
            }

            //Custom sorting needs to be written using java comparator
            Arrays.sort(str, new Comparator<String>() {
                @Override
                public int compare(String A, String B) {
                    String C = A.concat(B);
                    String D = B.concat(A);

                    return D.compareTo(C);   //Custom sorting lexicographically
                }
            });

            //Edge case ( Eg:-  "0000" should be returned as "0")
            if(str[0].equals("0") && str[N - 1].equals("0")) {
                return "0";
            }

            for(int i = 0; i < N; i++) {
                sb.append(str[i]);
            }
            return sb.toString();
        }
    }
}


/*Q2. Largest Number
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