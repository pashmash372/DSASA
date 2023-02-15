package com.scaler.dsa.assignment;


public class QuickSort {
    void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    int partition(int[] A, int low, int high) {
        // We can select pivot any element like: middle, first, last or random
        int pivot = A[high]; // pivot

        int i = (low - 1); // Index of smaller element

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (A[j] < pivot) {
                i++; // increment index of smaller element
                swap(A, i, j);
            }
        }
        swap(A, i + 1, high);
        return (i + 1);
    }

    void quickSort(int[] A, int low, int high) {
        if (low < high) {
            int idx = partition(A, low, high);
            quickSort(A, low, idx - 1);
            quickSort(A, idx + 1, high);
        }
    }

    public int[] solve(int[] A) {
        quickSort(A, 0, A.length - 1);
        return A;
    }
}

/*Quick sort with explaination*/

class QuickSort1 {
    public int[] solve(int[] A) {
        Quicksort(A, 0, A.length - 1);
        return A;
    }

    public int partition(int[] A, int s, int e) {
        // selecting random within the defined range
        // We take min and max variable to define the range for random numbers, both min and max inxlusive
        //range = max-min+1
        int randomindex = (int) (Math.random() * (e - s + 1) + s);
        //Swapping A[s] and A[randomindex] to bring A[randomindex] to its original positon
        int temp = A[randomindex];
        A[randomindex] = A[s];
        A[s] = temp;
        int l = s + 1, r = e;
        while (l <= r) {
            if (A[l] <= A[s]) {
                l++;
            } else if (A[r] > A[s]) {
                r--;
            } else {
                int swap = A[r];
                A[r] = A[l];
                A[l] = swap;
                l++;
                r--;
            }
        }
        //Now swapping s with l-1 for moving s to its correct position
        int correct = A[l - 1];
        A[l - 1] = A[s];
        A[s] = correct;
        return l - 1;
    }

    public void Quicksort(int[] A, int s, int e) {
        if (s >= e) {
            return;
        }
        int p = partition(A, s, e);
        Quicksort(A, s, p - 1);
        Quicksort(A, p + 1, e);
    }
}

/*Q1. QuickSort
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given an integer array A, sort the array using QuickSort.



Problem Constraints

1 <= |A| <= 105

1 <= A[i] <= 109



Input Format

First argument is an integer array A.



Output Format

Return the sorted array.



Example Input

Input 1:

 A = [1, 4, 10, 2, 1, 5]
Input 2:

 A = [3, 7, 1]


Example Output

Output 1:

 [1, 1, 2, 4, 5, 10]
Output 2:

 [1, 3, 7]


Example Explanation

Explanation 1:

 Return the sorted array.*/

/*There are many sorting algorithms, but for this problem we will use QuickSort of sort the array.
QuickSort is a Divide and Conquer Algorithm. It picks an element as pivot and partitions the given array around the picked pivot.

There are many different versions of quickSort that pick pivot in different ways:

-> Always pick first element as pivot.
-> Always pick last element as pivot (implemented below)
-> Pick a random element as pivot.
-> Pick median as pivot.

The key process in quickSort is partition().
Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x.
All this should be done in linear time.

Average Case Time Complexity : O(NlogN)
Worst Case : O(N2)*/