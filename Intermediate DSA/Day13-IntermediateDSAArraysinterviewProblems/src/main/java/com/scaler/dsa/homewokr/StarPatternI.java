package com.scaler.dsa.homewokr;

import java.util.Scanner;

public class StarPatternI {


    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;

        // first half
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++)
                System.out.print("*");
            for (j = 1; j <= (2 * i - 2); j++)
                System.out.print(" ");
            for (j = i; j <= n; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        // second half
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("*");
            for (j = (2 * i - 2); j < (2 * n - 2); j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }


}
/*Q2. Star Pattern I
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.

See example for clarifications over the pattern.



Problem Constraints

1 <= N <= 1000



Input Format

First line is an integer N



Output Format

N lines conatining only char '*' as per the question.



Example Input

Input 1:

4
Input 2:

6


Example Output

Output 1:

********
***  ***
**    **
*      *
*      *
**    **
***  ***
********
Output 2:

************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
*************/