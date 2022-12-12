package com.scaler.dsa.homework;


import java.util.ArrayList;

public class MaxSumWithoutAdjacentElements {
    public int adjacent(ArrayList <ArrayList< Integer >> A) {

        int n;
        int dp[];
        ArrayList < Integer > first, second;
        first = A.get(0);
        second = A.get(1);

        n = A.get(0).size();

        if (n == 0)
            return 0;

        dp = new int[n];
        dp[0] = Math.max(first.get(0), second.get(0));

        if (n < 2)
            return dp[0];

        dp[1] = Math.max(first.get(1), second.get(1));
        dp[1] = Math.max(dp[0], dp[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(first.get(i), second.get(i));
            dp[i] += dp[i - 2];
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }

        return dp[n - 1];
    }
}

/*Q2. Max Sum Without Adjacent Elements
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a 2 x N grid of integer, A, choose numbers such that the sum of the numbers is maximum and no two chosen numbers are adjacent horizontally, vertically or diagonally, and return it.

Note: You can choose more than 2 numbers.



Problem Constraints

1 <= N <= 20000
1 <= A[i] <= 2000



Input Format

The first and the only argument of input contains a 2d matrix, A.



Output Format

Return an integer, representing the maximum possible sum.



Example Input

Input 1:

 A = [
        [1]
        [2]
     ]
Input 2:

 A = [
        [1, 2, 3, 4]
        [2, 3, 4, 5]
     ]


Example Output

Output 1:

 2
Output 2:

 8


Example Explanation

Explanation 1:

 We will choose 2.
Explanation 2:

 We will choose 3 and 5.*/

/*Continued from Hint1:

V :
1 |  2  |  3  | 4
2 |  3  |  4  | 5

Lets first try to reduce it into a simpler problem.
We know that within a column, we can choose at max 1 element.
And choosing either of those elements is going to rule out choosing anything from the previous or next column.
This means that choosing V[0][i] or V[1][i] has identical bearing on the elements which are ruled out.
So, instead we replace each column with a single element which is the max of V[0][i], V[1][i].

Now we have the list as :
2 3 4 5

Here we can see that we have reduced our problem into another simpler problem.
Now we want to find maximum sum of values where no 2 values are adjacent.
Now our recurrence relation will depend only on position i and,
 a "include_current_element" which will denote whether we picked last element or not.

MAX_SUM(pos, include_current_element) =
IF include_current_element = FALSE THEN
    max ( MAX_SUM(pos - 1, FALSE) , MAX_SUM(pos - 1, TRUE) )

ELSE
    MAX_SUM(pos - 1, FALSE) + val(pos)

Happy Coding*/