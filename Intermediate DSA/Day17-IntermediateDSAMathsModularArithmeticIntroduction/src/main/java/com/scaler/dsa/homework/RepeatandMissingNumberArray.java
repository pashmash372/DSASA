package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepeatandMissingNumberArray {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        ArrayList<Integer> res = new ArrayList<>();

        Collections.sort(A);
        int n = A.size();
        int rep = -1;
        int miss = -1;
        long sum = A.get(0);

        for (int i = 1; i < n; i++) {
            if (A.get(i).intValue() == A.get(i - 1).intValue()) {
                rep = A.get(i);
            }
            sum += A.get(i);
        }

        miss = (int) ((1L * n * (1L * n + 1)) / 2 - sum + rep);

        res.add(rep);
        res.add(miss);

        return res;

    }
}


/*Q1. Repeat and Missing Number Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.
This is one of those problems.
Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105

Food for thought :

Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
Obviously approach 1 is more susceptible to overflows.
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3]

Output:[3, 4]

A = 3, B = 4*/

/*  Sum(Actual) = Sum(1...N) + A - B

    Sum(Actual) - Sum(1...N) = A - B.

    Sum(Actual Squares) = Sum(1^2 ... N^2) + A^2 - B^2

    Sum(Actual Squares) - Sum(1^2 ... N^2) = (A - B)(A + B)

    = (Sum(Actual) - Sum(1...N)) ( A + B).
We can use the above 2 equations to get the value of A and B.*/