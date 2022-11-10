package com.scaler.assignment;

public class QuickSort {

    public int[] solve(int[] A) {
        quickSort(A, 0, A.length - 1);
        return A;
    }

    void quickSort(int[] A, int low, int high) {
        if (low < high) {
            int idx = partition(A, low, high);
            quickSort(A, low, idx - 1);
            quickSort(A, idx + 1, high);
        }
    }

    int partition(int[] A, int low, int high) {
        int pivot = A[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (A[j] < pivot) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, high);
        return (i + 1);
    }

    void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
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