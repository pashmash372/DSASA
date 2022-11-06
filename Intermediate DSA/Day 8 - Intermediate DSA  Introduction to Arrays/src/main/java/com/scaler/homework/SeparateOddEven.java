package com.scaler.homework;


import java.lang.*;
import java.util.*;

public class SeparateOddEven {
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
            int cnto = 0;
            int cnte = 0;

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] % 2 == 1) {
                    cnto++;
                } else {
                    cnte++;
                }
            }
            int[] B = new int[cnto];
            int[] C = new int[cnte];
            int ptrB = 0;
            int ptrC = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 == 1) {
                    B[ptrB] = A[i];
                    ptrB++;
                } else {
                    C[ptrC] = A[i];
                    ptrC++;
                }
            }
            for (int i = 0; i < cnto; i++) {
                System.out.print(B[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < cnte; i++) {
                System.out.print(C[i] + " ");
            }
            System.out.println();
        }
    }
}


/*Q4. Separate Odd Even
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.

You have to print the odd and even elements of array A in 2 separate lines.

NOTE: Array elements should have the same relative order as in A.



Problem Constraints
1 <= T <= 10

1 <= |A| <= 105

1 <= A[i] <= 109



Input Format
First line of the input contains a single integer T.

For each test case:

First line consists of a single integer |A| denoting the length of array.
Second line consists of |A| space separated integers denoting the elements of array A.


Output Format
For each test case:

First line should contain an array of space separated integers containing all the odd elements of array A
Second line should contain an array of space separated integers containing all the even elements of array A


Example Input
Input 1:

 2
 5
 1 2 3 4 5
 3
 4 3 2
Input 2:

 2
 3
 2 2 2
 2
 1 1


Example Output
Output 1:

 1 3 5
 2 4
 3
 4 2
Output 2:


 2 2 2
 1 1



Example Explanation
Explanation 1:

 Test Case 1:
 Odd elements in the array(in the order they occur) are: 1, 3, 5.
 Even elements in the array(in the order they occur) are: 2, 4.

 Test Case 2
 Odd elements in the array(in the order they occur) are: 3.
 Even elements in the array(in the order they occur) are: 4, 2.
Explanation 2:

 Test Case 1:
 There are no odd elements in the array.
 Even elements in the array(in the order they occur) are: 2, 2, 2.

 Test Case 2
 Odd elements in the array(in the order they occur) are: 1, 1.
 There are no even elements in the array.

*/