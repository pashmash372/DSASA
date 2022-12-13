package com.scaler.assignment;


import java.lang.*;
import java.util.*;

public class MaxandMinofanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ma = a[0], mi = a[0];
        for (int i = 1; i < n; i++) {
            if (ma < a[i]) ma = a[i];
            if (mi > a[i]) mi = a[i];
        }

        System.out.println(String.valueOf(ma) + ' ' + String.valueOf(mi));
    }
}


/*Q3. Max and Min of an Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Write a program to print maximum and minimum elements of the input array A of size N. The first line of the input would contain a single integer N that represents the length of the array. The next N lines contain elements of the input array A.

Problem constraints

1 <= N <= 1000

1 <= A <= 1000



Input Format

The first line contains a single integer N representing the length of the array A.
The next N lines of input will contain the elements of array A.



Output Format

A single line output containing two space separated integers.
The first integer is the maximum value of the array.
The second integer is the minimum value of the array.



Example Input

Input 1:

5 1 2 3 4 5
Input 2:

4 10 50 40 80


Example Output

Output 1:

5 1
Output 2:

80 10
*/


/*First declare two variables max_element and min_element. Initialise them to 0.
Iterate all elements of the array and compare the elements with the max_element and min_element.
If the current element is greater than max_element then make max_element equal to that element.
If the current element is less than the min_element then make min_element equal to that element.
At the end of this for loop, you will have your maximum and minimum elements of the array.*/