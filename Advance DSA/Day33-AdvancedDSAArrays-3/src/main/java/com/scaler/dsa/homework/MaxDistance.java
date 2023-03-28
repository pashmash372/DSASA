package com.scaler.dsa.homework;


import java.util.Arrays;
import java.util.Comparator;

public class MaxDistance {
    public static void main(String[] args) {
        int[] A = {3, 5, 4, 2};
        System.out.println(new MaxDistance().maximumGap(A));
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        int n = A.length;
        int[] rmax = new int[n];
        int i, j, max = -1;
        // rmax stores the maximum element in the suffix
        for (i = n - 1; i >= 0; i--) {
            rmax[i] = (i == n - 1 || A[i] > rmax[i + 1]) ? A[i] : rmax[i + 1];
        }
        for (i = 0, j = 0; i < n && j < n; ) {
            if (A[i] <= rmax[j]) {
                if (j - i > max) max = j - i;
                j++;
            } else {
                i++;
            }
        }
        return max;
    }
}

/**/

class MaxDistance1 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {

        int n = A.length;
        int max = Integer.MIN_VALUE;

        //Create a 2D array to maintain the array elements and its indices
        int[][] A_index = new int[A.length][2];

        for (int i = 0; i < n; i++) {
            A_index[i][0] = A[i];
            A_index[i][1] = i;
        }

        //Sort the 2d array using comparator based on first elements
        Arrays.sort(A_index, Comparator.comparingInt(a -> a[0]));

    /*So afer sorting the max elements will be in the last So we are traversing from the last by tracking the index of max elements
and subtracting it from the current lesser element and return the max value in the last */

        int max_index = -1, ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            int cur_index = A_index[i][1];
            max_index = Math.max(cur_index, max_index);
            ans = Math.max(ans, max_index - cur_index);
        }

        return ans;


    }
}


/*Q1. Max Distance
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array, A of integers of size N. Find the maximum value of j - i such that A[i] <= A[j].



Problem Constraints
1 <= N <= 105

-109 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.



Output Format
Return an integer denoting the maximum value of j - i.



Example Input
Input 1:

A = [3, 5, 4, 2]
Input 2:

A = [4, 1, 3, 0]


Example Output
Output 1:

2
Output 2:

1


Example Explanation
Explanation 1:

For A[0] = 3 and A[2] = 4, the ans is (2 - 0) = 2.
Explanation 2:

For A[1] = 1 and A[2] = 3, the ans is (2 - 1) = 1.
*/

/*Continuing from the previous hint :

It is important to note that while sorting the array we must also store the original index of the values instead of blindly sorting it.

Now iterate over every element in the sorted array as A[i].

Let us say index[i] stores the actual index of A[i].

Now, we are looking for all values of A[j] which are bigger than A[i].

Since the array is sorted, the values will be all the elements to the right of A[i].

Since we want to maximize index[j] - index[i], and index[i] is fixed,
we are essentially looking at max index[j] for all j > i.

The problem concludes to finding the max in all the suffix of the array.

We can preprocess the index array and let indexMax[i] store the maximum of index[i….len]

This is how we can calculate max of all the suffix in O(n) :

       int maxIndex = INT_MIN; // -Infinity
           for (int i = len - 1; i >= 0; i--) {
            maxIndex = max(maxIndex, index[i]);
            indexMax[i] = maxIndex;
        }*/