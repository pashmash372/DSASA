package com.scaler.assignment;


import java.lang.*;
import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int B;
            B = sc.nextInt();
            int found = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] == B) {
                    found = 1;
                }
            }
            System.out.println(found);
        }
    }
}


/*Q5. Search Element
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.



Problem Constraints

1 <= T <= 10

1 <= A <= 105

1 <= A[i], B <= 109



Input Format

First line of the input contains a single integer T.

Next, each of the test case consists of 3 lines:

First line contains a single integer A denoting the length of array
Second line contains A integers denoting the array elements
Third line contains a single integer B


Output Format

For each test case, print on a separate line 1 if the element exists, else print 0.



Example Input

Input 1:

 1
 5
 4 1 5 9 1
 5
Input 2:

 1
 3
 7 7 2
 1


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

  B = 5  is present at position 3 in A
Explanation 2:

  B = 1  is not present in A. */


/*Iterate for i= 0 to N-1
Check if A[i] = B then print(1) and break
else print(0)*/