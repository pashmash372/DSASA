package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public int solve(int[] A) {
        int n = A.length;
        // sort the array
        Arrays.sort(A);
        // initialize variables
        int steps = 0, i = 1, j = 0;
        // loop unitil you reach the end
        while (j < n) {
            // make current element unique
            if (i >= A[j]) {
                steps += (i - A[j++]);
                i += 1;
            } else {
                i = A[j] + 1;
                j += 1;
            }
        }
        // return the answer
        return steps;
    }
}

/*Unique Element using Java Arraylist with comment explanation*/

class UniqueElements1 {
    public int solve(ArrayList<Integer> A) {

        int count = 0;
        Collections.sort(A);
        System.out.println("sorted A: "+A);
        // iterate over the loop
        for (int i = 1; i < A.size(); i++) {
            // check if the adjacent element are equal or smaller than the previous element
            if (A.get(i - 1) >= A.get(i)) {
                // if yes then find the difference between them and add to the count
                count += A.get(i - 1) + 1 - A.get(i);
                // now the assign the current element at i with preivous element
                // as the previous element will increase by one stem
                A.set(i, A.get(i - 1) + 1);
            }
        }
        return count;
    }
}
/*Q1. Unique Elements
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an array A of N elements. You have to make all elements unique. To do so, in one step you can increase any number by one.

Find the minimum number of steps.



Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109



Input Format
The only argument given is an Array A, having N integers.



Output Format
Return the minimum number of steps required to make all elements unique.



Example Input
Input 1:

 A = [1, 1, 3]
Input 2:

 A = [2, 4, 5]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 We can increase the value of 1st element by 1 in 1 step and will get all unique elements. i.e [2, 1, 3].
Explanation 2:

 All elements are distinct.
*/

/*The task is to make all the array elements unique, which needs to be done optimally in the minimum number of steps.
Sort the Array and then start the traversing from the 2nd element.
If the current element is the same as the previous one, then make this element equal to (previous + 1) and count the steps.*/