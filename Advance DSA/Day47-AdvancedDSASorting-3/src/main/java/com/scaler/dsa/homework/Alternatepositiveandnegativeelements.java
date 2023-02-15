package com.scaler.dsa.homework;


public class Alternatepositiveandnegativeelements {
    public int[] solve(int[] A) {
        rearrange(A, A.length);
        return A;
    }

    public void rightRotate(int[] a, int n, int l, int r) { // shifting >> right side
        // right rotates the subarray a[l]..a[r]
        int t = a[r];
        for (int i = r; i > l; i--)
            a[i] = a[i - 1];
        a[l] = t;
    }

    void rearrange(int[] a, int n) {
        int op = -1;
        for (int ind = 0; ind < n; ind++) {
            // finds an element with opposite sign to the out of place element
            if (op >= 0) {
                // (ele is positive && a[op] is negative  || ele is negative && a[op] is positive)
                if ((a[ind] >= 0 && a[op] < 0) || (a[ind] < 0 && a[op] >= 0)) {
                    rightRotate(a, n, op, ind);
                    if (ind - op > 2) op = op + 2;
                    else op = -1;
                }
            }
            // finds an out of place element
            if (op == -1) {
                // (ele is positive && index is even) || (ele is negative && index is odd )
                if ((a[ind] >= 0 && (ind & 1) == 0) || (a[ind] < 0 && (ind & 1) == 1)) op = ind;
            }
        }
    }
}

/*Simple Java Solution*/
class Alternatepositiveandnegativeelements1 {
    public int[] solve(int[] A) {
        int i = 0, j = 0, k = 0;

        for (i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                if (A[i] < 0) continue;
                while (j < A.length && j <= i) j++;
                while (j < A.length && A[j] >= 0) j++;
                if (j < A.length) bubbleUp(A, i, j);
                j++;
            } else if (i % 2 == 1) {
                if (A[i] >= 0) continue;
                while (k < A.length && k <= i) k++;
                while (k < A.length && A[k] < 0) k++;
                if (k < A.length) bubbleUp(A, i, k);
                k++;
            }

        }

        return A;
    }

    public void bubbleUp(int[] A, int i, int j) {
        while (j > i) {
            int temp = A[j];
            A[j] = A[j - 1];
            A[j - 1] = temp;
            j--;
        }
    }
}

/*Q2. Alternate positive and negative elements
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, arrange them in an alternate fashion such that every non-negative number is followed by negative and vice-versa, starting from a negative number, maintaining the order of appearance. The number of non-negative and negative numbers need not be equal.

If there are more non-negative numbers, they appear at the end of the array. If there are more negative numbers, they also appear at the array's end.

Note: Try solving with O(1) extra space.



Problem Constraints
1 <= length of the array <= 7000
-109 <= A[i] <= 109



Input Format
The first argument given is the integer array A.



Output Format
Return the modified array.



Example Input
Input 1:

 A = [-1, -2, -3, 4, 5]
Input 2:

 A = [5, -17, -100, -11]


Example Output
Output 1:

 [-1, 4, -2, 5, -3]
Output 2:

 [-17, 5, -100, -11]


Example Explanation
Explanation 1:

A = [-1, -2, -3, 4, 5]
Move 4 in between -1 and -2, A => [-1, 4, -2, -3, 5]
Move 5 in between -2 and -3, A => [-1, 4, -2, 5, -3]
*/

/*The above problem can be easily solved if O(n) extra space is allowed. It becomes interesting due to the limitations that O(1) extra space and order of appearances.

The idea is to process the array from left to right. While processing, find the first out-of-place element in the remaining unprocessed array. An element is out of place if it is negative and at an odd index, positive and even index. Once we find an out-of-place element, we find the first element after it with the opposite sign. We right rotate the subarray between these two elements (including these two).

// Bonus
The idea is to process the array and shift all negative values to the end in O(n) time.

After all negative values are shifted to the end, we can easily rearrange the array in alternating positive & negative items.

We swap the next positive element at an even position from the next negative element in this step.*/